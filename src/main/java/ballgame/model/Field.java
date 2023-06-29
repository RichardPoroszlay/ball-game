package ballgame.model;


public class Field {
    private int row;
    private int col;
    private boolean ballOnField;
    private boolean finish;
    private boolean wallTop;
    private boolean wallBottom;
    private boolean wallLeft;
    private boolean wallRight;

    public Field(){
    }

    public Field(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return this.col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public boolean isBallOnField() {
        return this.ballOnField;
    }

    public void setBallOnField(boolean ballOnField) {
        this.ballOnField = ballOnField;
    }

    public boolean isFinish() {
        return this.finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public boolean hasWallTop() {
        return wallTop;
    }

    public void setWallTop(boolean wallTop) {
        this.wallTop = wallTop;
    }

    public boolean hasWallBottom() {
        return wallBottom;
    }

    public void setWallBottom(boolean wallBottom) {
        this.wallBottom = wallBottom;
    }

    public boolean hasWallLeft() {
        return wallLeft;
    }

    public void setWallLeft(boolean wallLeft) {
        this.wallLeft = wallLeft;
    }

    public boolean hasWallRight() {
        return wallRight;
    }

    public void setWallRight(boolean wallRight) {
        this.wallRight = wallRight;
    }
}
