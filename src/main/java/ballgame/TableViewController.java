package ballgame;

import ballgame.result.GameResult;
import ballgame.result.JsonGameResultManager;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


import java.io.IOException;
import java.nio.file.Path;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * This class is representing the controller of the leaderboard.
 *
 * @author Richard Poroszlay
 */
public class TableViewController {

    @FXML
    private TableView<GameResult> tableView;

    @FXML
    private TableColumn<GameResult, String> playerName;

    @FXML
    private TableColumn<GameResult, Integer> steps;

    @FXML
    private TableColumn<GameResult, String> created;

    @FXML
    private void initialize() throws IOException {
        playerName.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        steps.setCellValueFactory(new PropertyValueFactory<>("steps"));
        created.setCellValueFactory(
                cellData -> {
                    var dateTime = cellData.getValue().getCreated();
                    var formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
                    return new ReadOnlyStringWrapper(formatter.format(dateTime));
                }
        );
        ObservableList<GameResult> observableList = FXCollections.observableArrayList();
        observableList.addAll(new JsonGameResultManager(Path.of("results.json")).getBest(10));
        tableView.setItems(observableList);
    }

}