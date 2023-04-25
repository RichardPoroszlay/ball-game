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

    @Test
    public void fieldShouldNotHaveWallTop() {
        var field = new Field();
        field.setWallTop(false);
        assertFalse(field.hasWallTop());
    }

    @Test
    public void fieldShouldHaveWallBottom() {
        var field = new Field();
        field.setWallBottom(true);
        assertTrue(field.hasWallBottom());
    }

    @Test
    public void fieldShouldNotHaveWallBottom() {
        var field = new Field();
        field.setWallBottom(false);
        assertFalse(field.hasWallBottom());
    }

    @Test
    public void fieldShouldHaveWallLeft() {
        var field = new Field();
        field.setWallLeft(true);
        assertTrue(field.hasWallLeft());
    }

    @Test
    public void fieldShouldNotHaveWallLeft() {
        var field = new Field();
        field.setWallLeft(false);
        assertFalse(field.hasWallLeft());
    }

    @Test
    public void fieldShouldHaveWallRight() {
        var field = new Field();
        field.setWallRight(true);
        assertTrue(field.hasWallRight());
    }

    @Test
    public void fieldShouldNotHaveWallRight() {
        var field = new Field();
        field.setWallRight(false);
        assertFalse(field.hasWallRight());
    }
}
