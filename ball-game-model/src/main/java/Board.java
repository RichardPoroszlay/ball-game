public class Board {
    private Field[][] fields;
    private Ball ball;

    public Board() {
        fields = new Field[7][7];

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
    }
}
