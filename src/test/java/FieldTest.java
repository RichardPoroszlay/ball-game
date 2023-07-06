import ballgame.model.Field;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FieldTest {

    private Field field;

    @BeforeEach
    public void setUp() {
        field = new Field(4, 3);
    }

    @Test
    public void testGetRow() {
        assertEquals(4, field.getRow());
    }

    @Test
    public void testSetRow() {
        field.setRow(5);
        assertEquals(5, field.getRow());
    }

    @Test
    public void testGetCol() {
        assertEquals(3, field.getCol());
    }

    @Test
    public void testSetCol() {
        field.setCol(0);
        assertEquals(0, field.getCol());
    }

    @Test
    public void ballShouldBeOnField() {
        field.setBallOnField(true);
        assertTrue(field.isBallOnField());
    }

    @Test
    public void ballShouldNotBeOnField() {
        field.setBallOnField(false);
        assertFalse(field.isBallOnField());
    }

    @Test
    public void finishFieldShouldBeTrue() {
        field.setFinish(true);
        assertTrue(field.isFinish());
    }

    @Test
    public void finishFieldShouldBeFalse() {
        field.setFinish(false);
        assertFalse(field.isFinish());
    }

    @Test
    public void fieldShouldHaveWallTop() {
        field.setWallTop(true);
        assertTrue(field.hasWallTop());
    }

    @Test
    public void fieldShouldNotHaveWallTop() {
        field.setWallTop(false);
        assertFalse(field.hasWallTop());
    }

    @Test
    public void fieldShouldHaveWallBottom() {
        field.setWallBottom(true);
        assertTrue(field.hasWallBottom());
    }

    @Test
    public void fieldShouldNotHaveWallBottom() {
        field.setWallBottom(false);
        assertFalse(field.hasWallBottom());
    }

    @Test
    public void fieldShouldHaveWallLeft() {
        field.setWallLeft(true);
        assertTrue(field.hasWallLeft());
    }

    @Test
    public void fieldShouldNotHaveWallLeft() {
        field.setWallLeft(false);
        assertFalse(field.hasWallLeft());
    }

    @Test
    public void fieldShouldHaveWallRight() {
        field.setWallRight(true);
        assertTrue(field.hasWallRight());
    }

    @Test
    public void fieldShouldNotHaveWallRight() {
        field.setWallRight(false);
        assertFalse(field.hasWallRight());
    }
}
