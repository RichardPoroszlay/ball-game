package ballgame.model;

/**
 * Class representing a single field on the board.
 * Each field can have walls on its top, bottom, left and right sides,
 * and a field can also be a finish field.
 * We can also check whether the ball is on a certain field or not.
 *
 * @author Richard Poroszlay
 */
public class Field {
    private int row;
    private int col;
    private boolean ballOnField;
    private boolean finish;
    private boolean wallTop;
    private boolean wallBottom;
    private boolean wallLeft;
    private boolean wallRight;

    /**
     * No-args constructor.
     *
     * @author Richard Poroszlay
     */
    public Field(){
    }

    /**
     * Two args constructor which sets the coordinates of a field on the board.
     *
     * @param row it's the value of the row position of the field. Accepted values: [0,6]
     * @param col it's the value of the column position of the field. Accepted values: [0,6]
     * @author Richard Poroszlay
     */
    public Field(int row, int col) {
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
        return this.row;
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
        return this.col;
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

    /**
     * Checks whether the ball is on the field or not.
     *
     * @return true, if the ball is on the field, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean isBallOnField() {
        return this.ballOnField;
    }

    /**
     * Setter for field ballOnField.
     *
     * @param ballOnField the given value of the parameter will be the new value of private field ballOnField.
     * @author Richard Poroszlay
     */
    public void setBallOnField(boolean ballOnField) {
        this.ballOnField = ballOnField;
    }

    /**
     * Checks whether the field is the finish field or not.
     *
     * @return true, if the field is the finish field, otherwise it returns false.
     * @author RichardPoroszlay
     */
    public boolean isFinish() {
        return this.finish;
    }

    /**
     * Setter for field finish
     *
     * @param finish the given value of the parameter will be the new value of private field finish.
     * @author Richard Poroszlay
     */
    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    /**
     * Checks whether a certain field has a wall on the top or not.
     *
     * @return true, if the field has a wall on the top, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallTop() {
        return wallTop;
    }

    /**
     * Setter for field wallTop
     *
     * @param wallTop the given value of the parameter will be the new value of private field wallTop.
     * @author Richard Poroszlay
     */
    public void setWallTop(boolean wallTop) {
        this.wallTop = wallTop;
    }

    /**
     * Checks whether a certain field has a wall on the bottom or not.
     *
     * @return true, if the field has a wall on the bottom, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallBottom() {
        return wallBottom;
    }

    /**
     * Setter for field wallBottom
     *
     * @param wallBottom the given value of the parameter will be the new value of private field wallBottom.
     * @author Richard Poroszlay
     */
    public void setWallBottom(boolean wallBottom) {
        this.wallBottom = wallBottom;
    }

    /**
     * Checks whether a certain field has a wall on the left or not.
     *
     * @return true, if the field has a wall on the left, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallLeft() {
        return wallLeft;
    }

    /**
     * Setter for field wallLeft
     *
     * @param wallLeft the given value of the parameter will be the new value of private field wallLeft.
     * @author Richard Poroszlay
     */
    public void setWallLeft(boolean wallLeft) {
        this.wallLeft = wallLeft;
    }

    /**
     * Checks whether a certain field has a wall on the right or not.
     *
     * @return true, if the field has a wall on the right, otherwise it returns false.
     * @author Richard Poroszlay
     */
    public boolean hasWallRight() {
        return wallRight;
    }

    /**
     * Setter for field wallRight
     *
     * @param wallRight the given value of the parameter will be the new value of private field wallRight.
     * @author Richard Poroszlay
     */
    public void setWallRight(boolean wallRight) {
        this.wallRight = wallRight;
    }
}
