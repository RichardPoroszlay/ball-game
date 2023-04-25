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
}
