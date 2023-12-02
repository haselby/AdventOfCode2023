package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RGBCubesTest {
    private RGBCubes rgbCubes;

    @BeforeEach
    public void setUp() {
        rgbCubes = new RGBCubes(255, 255, 255);
    }

    @Test
    public void testRed() {
        rgbCubes.setRed(128);
        assertEquals(128, rgbCubes.getRed());
    }

    @Test
    public void testGreen() {
        rgbCubes.setGreen(128);
        assertEquals(128, rgbCubes.getGreen());
    }

    @Test
    public void testBlue() {
        rgbCubes.setBlue(128);
        assertEquals(128, rgbCubes.getBlue());
    }

    @Test
    public void testAdd() {
    RGBCubes other = new RGBCubes(50, 50, 50);
    rgbCubes.add(other);
    assertEquals(305, rgbCubes.getRed());
    assertEquals(305, rgbCubes.getGreen());
    assertEquals(305, rgbCubes.getBlue());
}
}

