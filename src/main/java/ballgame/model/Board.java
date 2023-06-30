package ballgame.model;


public class Board {

    public static int BOARD_SIZE = 7;
    private Ball ball;
    private final Field[][] board = new Field[BOARD_SIZE][BOARD_SIZE];
    private int stepCounter;

    public Board() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = new Field(row, col);
            }
        }

        board[0][0].setWallRight(true);
        board[0][1].setWallLeft(true);
        board[0][2].setWallBottom(true);
        board[0][3].setWallRight(true);
        board[0][4].setWallLeft(true);
        board[0][6].setWallBottom(true);
        board[1][2].setWallTop(true);
        board[1][6].setWallTop(true);
        board[2][1].setWallBottom(true);
        board[2][2].setWallRight(true);
        board[2][3].setWallLeft(true);
        board[2][5].setWallRight(true);
        board[2][6].setWallLeft(true);
        board[3][1].setWallTop(true);
        board[3][3].setWallRight(true);
        board[3][3].setWallBottom(true);
        board[3][4].setWallLeft(true);
        board[3][4].setWallRight(true);
        board[3][5].setWallLeft(true);
        board[3][6].setWallBottom(true);
        board[4][0].setWallBottom(true);
        board[4][3].setWallTop(true);
        board[4][4].setWallBottom(true);
        board[4][6].setWallTop(true);
        board[5][0].setWallTop(true);
        board[5][1].setWallRight(true);
        board[5][2].setWallLeft(true);
        board[5][2].setWallBottom(true);
        board[5][2].setWallRight(true);
        board[5][3].setWallLeft(true);
        board[5][4].setWallTop(true);
        board[6][2].setWallTop(true);
        board[6][3].setWallRight(true);
        board[6][4].setWallLeft(true);
        board[6][5].setWallRight(true);
        board[6][6].setWallLeft(true);

        board[5][2].setFinish(true);

        ball = new Ball(1, 4);
        board[ball.getRow()][ball.getCol()].setBallOnField(true);
        stepCounter = 0;
    }

    public void moveBall(Direction direction) {
        int newRow = ball.getRow();
        int newCol = ball.getCol();

        switch (direction) {
            case UP -> {
                boolean cond = true;
                while(cond) {
                    if (newRow > 0 && !board[newRow][newCol].hasWallTop()) {
                        newRow--;
                    }
                    else {
                        cond = false;
                    }
                }
            }
            case DOWN -> {
                boolean cond = true;
                while(cond) {
                    if (newRow < 6 && !board[newRow][newCol].hasWallBottom()) {
                        newRow++;
                    }
                    else {
                        cond = false;
                    }
                }
            }
            case LEFT -> {
                boolean cond = true;
                while(cond) {
                    if (newCol > 0 && !board[newRow][newCol].hasWallLeft()) {
                        newCol--;
                    }
                    else {
                        cond = false;
                    }
                }
            }
            case RIGHT -> {
                boolean cond = true;
                while(cond) {
                    if (newCol < 6 && !board[newRow][newCol].hasWallRight()) {
                        newCol++;
                    }
                    else {
                        cond = false;
                    }
                }

            }
            default -> throw new IllegalStateException("Unexpected value: " + direction);
        }

        // if the ball moves, the default coordinates change
        if(newRow != ball.getRow() || newCol != ball.getCol()) {
            board[ball.getRow()][ball.getCol()].setBallOnField(false);
            ball.setRow(newRow);
            ball.setCol(newCol);
            board[ball.getRow()][ball.getCol()].setBallOnField(true);
        }
    }

    public int getBallX() {
        return ball.getRow();
    }

    public int getBallY() {
        return ball.getCol();
    }

    public void addOneToStepCounter() {
        stepCounter += 1;
    }

    public int getStepCounter() {
        return stepCounter;
    }

    public boolean isGameOver() {
        return board[ball.getRow()][ball.getCol()].isFinish();
    }
}
