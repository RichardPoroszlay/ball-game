import ballgame.model.Board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    private Board board;

    @BeforeEach
    public void setUp() {
        board = new Board();
    }

    @Test
    public void isStepIncreasedByOne() {
        board.addOneToStepCounter();
        assertEquals(1, board.getStepCounter());
    }

    @Test
    public void testGetStepCounter() {
        assertEquals(0, board.getStepCounter());
    }
}
