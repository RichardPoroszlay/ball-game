import ballgame.model.Field;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {
    //TODO
    @Test
    public void finishFieldShouldBeTrue() {
        var field = new Field();
        field.setFinish(true);
        assertTrue(field.isFinish());
    }

    @Test
    public void finishFieldShouldBeFalse() {
        var field = new Field();
        field.setFinish(false);
        assertFalse(field.isFinish());
    }

    @Test
    public void fieldShouldHaveWallTop() {
        var field = new Field();
        field.setWallTop(true);
        assertTrue(field.hasWallTop());
    }
}
