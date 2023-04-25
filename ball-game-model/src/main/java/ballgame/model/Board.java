package ballgame.model;

/**
 * Class representing the game board and holding the current state of the game.
 *
 * @author Richard Poroszlay
 */
public class Board {
    private final Field[][] fields;
    private Ball ball;

    /**
     * This constructor initializes the game board with walls,
     * moreover it places the finish field and the ball on the board.
     *
     * @author Richard Poroszlay
     */
    public Board() {
        fields = new Field[7][7];
        for(int row = 0; row < 7; row++) {
            for(int col = 0; col < 7; col++) {
                fields[row][col] = new Field(row, col);
            }
        }

        fields[0][0].setWallRight(true);
        fields[0][1].setWallLeft(true);
        fields[0][2].setWallBottom(true);
        fields[0][3].setWallRight(true);
        fields[0][4].setWallLeft(true);
        fields[0][6].setWallBottom(true);
        fields[1][2].setWallTop(true);
        fields[1][6].setWallTop(true);
        fields[2][1].setWallBottom(true);
        fields[2][2].setWallRight(true);
        fields[2][3].setWallLeft(true);
        fields[2][5].setWallRight(true);
        fields[2][6].setWallLeft(true);
        fields[3][1].setWallTop(true);
        fields[3][3].setWallRight(true);
        fields[3][3].setWallBottom(true);
        fields[3][4].setWallLeft(true);
        fields[3][4].setWallRight(true);
        fields[3][5].setWallLeft(true);
        fields[3][6].setWallBottom(true);
        fields[4][0].setWallBottom(true);
        fields[4][3].setWallTop(true);
        fields[4][4].setWallBottom(true);
        fields[4][6].setWallTop(true);
        fields[5][0].setWallTop(true);
        fields[5][1].setWallRight(true);
        fields[5][2].setWallLeft(true);
        fields[5][2].setWallBottom(true);
        fields[5][2].setWallRight(true);
        fields[5][3].setWallLeft(true);
        fields[5][4].setWallTop(true);
        fields[6][2].setWallTop(true);
        fields[6][3].setWallRight(true);
        fields[6][4].setWallLeft(true);
        fields[6][5].setWallRight(true);
        fields[6][6].setWallLeft(true);

        fields[5][2].setFinish(true);

        ball = new Ball(1,4);
        fields[ball.getRow()][ball.getCol()].setBallOnField(true);
    }

    /**
     * This method attempts to move the ball to the chosen direction.
     * If the ball can't move to the chosen direction (because there is a wall or the board edge is reached),
     * then the ball doesn't move.
     *
     * @param direction the value of this parameter is one of the four main directions from the ballgame.model.Direction enumeration.
     * @author Richard Poroszlay
     */
    public void moveBall(Direction direction) {
        int newRow = ball.getRow();
        int newCol = ball.getCol();

        switch (direction) {
            case UP -> {
                if (ball.getRow() > 0 && !fields[ball.getRow()][ball.getCol()].hasWallTop()) {
                    newRow--;
                }
            }
            case DOWN -> {
                if (ball.getRow() < 6 && !fields[ball.getRow()][ball.getCol()].hasWallBottom()) {
                    newRow++;
                }
            }
            case LEFT -> {
                if (ball.getCol() > 0 && !fields[ball.getRow()][ball.getCol()].hasWallLeft()) {
                    newCol--;
                }
            }
            case RIGHT -> {
                if (ball.getCol() < 6 && !fields[ball.getRow()][ball.getCol()].hasWallRight()) {
                    newCol++;
                }
            }
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        }

        // if the ball moves, the default coordinates change
        if(newRow != ball.getRow() && newCol != ball.getCol()) {
            ball.setRow(newRow);
            ball.setCol(newCol);
        }
    }

    /**
     * This method checks whether the game is over or not.
     * If the coordinates of the ball are the same with the coordinates of the finish field,
     * then the game is over, otherwise it's not.
     *
     * @return the method returns true if the game is over, otherwise it returns true.
     * @author Richard Poroszlay
     */
    public boolean isGameOver() {
        return fields[ball.getRow()][ball.getCol()].isFinish();
    }
}
