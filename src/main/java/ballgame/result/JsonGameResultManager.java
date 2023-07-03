package ballgame.result;


import lombok.NonNull;
import util.JacksonHelper;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


/**
 * In this class we are managing data with the help of Jackson.
 *
 * @author Richard Poroszlay
 */
public class JsonGameResultManager implements GameResultManager {

    private Path filePath;

    /**
     * Constructor, which initializes the name of the json file.
     *
     * @param filePath the name of the json file, where data will be stored.
     * @author Richard Poroszlay
     */
    public JsonGameResultManager(@NonNull Path filePath) {
        this.filePath = filePath;
    }

    /**
     * This method adds a result to the leaderboard
     *
     * @param result the result what the player made
     * @return it returns the 'list' of results
     * @throws IOException the method could throw an IOException
     * @author Richard Poroszlay
     */
    @Override
    public List<GameResult> add(@NonNull GameResult result) throws IOException {
        var results = getAll();
        results.add(result);
        try (var out = Files.newOutputStream(filePath)) {
            JacksonHelper.writeList(out, results);
        }
        return results;
    }

    /**
     * This method reads all the result in the leaderboard.
     *
     * @return it returns the leaderboard
     * @throws IOException the method could throw an IOException
     */
    public List<GameResult> getAll() throws IOException {
        if (!Files.exists(filePath)) {
            return new ArrayList<GameResult>();
        }
        try (var in = Files.newInputStream(filePath)) {
            return JacksonHelper.readList(in, GameResult.class);
        }
    }

}