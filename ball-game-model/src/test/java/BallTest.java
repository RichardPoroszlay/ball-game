import ballgame.model.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BallTest {
    private Ball ball;

    @BeforeEach
    public void setUp() {
        Ball ball = new Ball(3,4);
    }

    @Test
    public void getRow() {
        assertEquals(3, ball.getRow());
    }

    @Test
    public void getCol() {
        assertEquals(4, ball.getCol());
    }
}
