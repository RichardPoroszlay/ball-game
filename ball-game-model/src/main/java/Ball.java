import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Class representing the ball and its position in the game.
 * @author Richard Poroszlay
 */
@Data
@AllArgsConstructor
public class Ball {
    private int row;
    private int col;
}
