package ballgame;

import ballgame.model.Board;
import ballgame.model.Direction;
import ballgame.result.GameResult;
import ballgame.result.GameResultManager;
import ballgame.result.JsonGameResultManager;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.nio.file.Path;
import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.Scanner;


/**
 * This class is representing the controller layer of the game.
 * Its responsibility is to merge the model and the view layers.
 *
 * @author Richard Poroszlay
 */
public class BallGameController {

    private static final Logger logger = LogManager.getLogger(BallGameController.class);

    @FXML
    private GridPane grid;

    @FXML
    private Circle myCircle;

    private static Board model = new Board();

    private static String username;

    @FXML
    private void initialize() {;
        registerKeyEventHandler();
        var scanner = new Scanner(System.in);
        logger.info("Please, enter your name!");
        username = scanner.nextLine();
    }

    private void restartGame() {
        model = new Board();
        grid.getChildren().remove(myCircle);
        grid.add(myCircle, model.getBallY(), model.getBallX());
        logger.info("Game restarted");
    }

    private void registerKeyEventHandler() {
        Platform.runLater(() -> grid.getScene().setOnKeyPressed(this::handleKeyPress));
    }

    @FXML
    private void handleKeyPress(KeyEvent keyEvent) {
        var restartKeyCombination = new KeyCodeCombination(KeyCode.R, KeyCombination.CONTROL_DOWN);
        var quitKeyCombination = new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN);
        if (restartKeyCombination.match(keyEvent)) {
            logger.info("RESTART");
            restartGame();
        } else if (quitKeyCombination.match(keyEvent)) {
            logger.info("Exiting");
            Platform.exit();
        } else if (keyEvent.getCode() == KeyCode.W) {
            logger.info("UP");
            model.addOneToStepCounter();
            performMove(Direction.UP);
        } else if (keyEvent.getCode() == KeyCode.D) {
            logger.info("RIGHT");
            model.addOneToStepCounter();
            performMove(Direction.RIGHT);
        } else if (keyEvent.getCode() == KeyCode.S) {
            logger.info("DOWN");
            model.addOneToStepCounter();
            performMove(Direction.DOWN);
        } else if (keyEvent.getCode() == KeyCode.A) {
            logger.info("LEFT");
            model.addOneToStepCounter();
            performMove(Direction.LEFT);
        }
    }

    private void switchToLeaderboard() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/table.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) grid.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static GameResult createGameResult() {
        return GameResult.builder()
                .playerName(username)
                .solved(true)
                .steps(model.getStepCounter())
                .created(ZonedDateTime.now().minusMinutes(0))
                .build();
    }

    private void performMove(Direction direction) {
        grid.getChildren().remove(myCircle);
        model.moveBall(direction);
        grid.add(myCircle, model.getBallY(), model.getBallX());
        logger.info("Current coordinates of the ball: " + "{" + model.getBallX() + ", " + model.getBallY() + "}");

        if(model.isGameOver()) {
            var alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Game Over");
            alert.setContentText("Congratulations, you have solved the puzzle!");
            logger.info("Game Over");
            logger.info("Congratulations, you have solved the puzzle!");
            logger.info("Total steps: " + model.getStepCounter());

            Optional<ButtonType> result = alert.showAndWait();
            if(!result.isPresent()) {
                logger.info("No alert button is pressed");
                restartGame();
            } else if(result.get() == ButtonType.OK) {
                logger.info("Alert button is pressed");
                GameResultManager manager = new JsonGameResultManager(Path.of("results.json"));
                try {
                    manager.add(createGameResult());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                logger.info("Switched to leaderboard");
                switchToLeaderboard();
            }
        }
    }
}