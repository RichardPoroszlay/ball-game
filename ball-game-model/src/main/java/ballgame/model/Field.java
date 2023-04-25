package ballgame.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class representing a single field on the board.
 * Each field can have walls on its top, bottom, left and right sides,
 * and a field can also be a finish field.
 *
 * @author Richard Poroszlay
 */
@Data
@NoArgsConstructor
public class Field {
    private int row;
    private int col;
    private boolean ballOnField;
    private boolean finish;
    private boolean wallTop;
    private boolean wallBottom;
    private boolean wallLeft;
    private boolean wallRight;

    public Field(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     *
     * @return true, if the ball is on the field, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean isBallOnField() { return this.ballOnField; }

    /**
     * @return true, if the field is a finish field, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean isFinish() {
        return this.finish;
    }

    /**
     * @return true, if the field has a wall on the top side, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallTop() { return this.wallTop; }

    /**
     * @return true, if the field has a wall on the bottom side, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallBottom() {
        return this.wallBottom;
    }

    /**
     * @return true, if the field has a wall on the left side, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallLeft() {
        return this.wallLeft;
    }

    /**
     * @return true, if the field has a wall on the right side, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallRight() {
        return this.wallRight;
    }
}
