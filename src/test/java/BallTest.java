import ballgame.model.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BallTest {

    private Ball ball;

    @BeforeEach
    public void setUp() {
        ball = new Ball(1,4);
    }

    @Test
    public void testGetRow() {
        assertEquals(1, ball.getRow());
    }

    @Test
    public void testGetCol() {
        assertEquals(4, ball.getCol());
    }

    @Test
    public void testSetRow() {
        ball.setRow(2);
        assertEquals(2, ball.getRow());
    }

    @Test
    public void testSetCol() {
        ball.setCol(3);
        assertEquals(3, ball.getCol());
    }
}
