import ballgame.model.Ball;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {
    private Ball ball;

    @BeforeEach
    public void setUp() {
        Ball ball = new Ball(3,4);
    }
}
