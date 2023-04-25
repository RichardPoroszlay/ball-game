import ballgame.model.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BallTest {
    private Ball ball;

    @BeforeEach
    public void setUp() {
        ball = new Ball(3,4);
    }

    @Test
    public void testGetRow() {
        assertEquals(3, ball.getRow());
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
}
