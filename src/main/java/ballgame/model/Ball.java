package ballgame.model;


/**
 * Class representing the ball and its position in the game.
 *
 * @author Richard Poroszlay
 */
public class Ball {
    private int row;
    private int col;

    /**
     * No-args constructor.
     *
     * @author Richard Poroszlay
     */
    public Ball() {
    }

    /**
     * All-args constructor.
     *
     * @param row it's the value of the row position of the ball. Accepted values: [0,6]
     * @param col it's the value of the column position of the ball. Accepted values: [0,6]
     * @author Richard Poroszlay
     */
    public Ball(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * Getter for field row.
     *
     * @return the method returns the value of private field row.
     * @author Richard Poroszlay
     */
    public int getRow() {
        return row;
    }

    /**
     * Setter for field row.
     *
     * @param row the given value of the parameter will be the new value of private field row.
     * @author Richard Poroszlay
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * Getter for field col.
     *
     * @return the method returns the value of private field col.
     * @author Richard Poroszlay
     */
    public int getCol() {
        return col;
    }

    /**
     * Setter for field col.
     *
     * @param col the given value of the parameter will be the new value of private field col.
     * @author Richard Poroszlay
     */
    public void setCol(int col) {
        this.col = col;
    }
}
