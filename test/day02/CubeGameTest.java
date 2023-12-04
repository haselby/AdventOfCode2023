package day02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubeGameTest {
    private CubeGame cubeGame;
    private CubeGame cubeGame2;

    private CubeGame cubeGame3;
    private RGBCubes rgbCubes;

    @BeforeEach
    public void setUp() {
        List<RGBCubes> cubes = new ArrayList<>();
        rgbCubes = new RGBCubes(255, 255, 255);
        cubes.add(rgbCubes);
        cubeGame = new CubeGame(1, cubes);
        cubeGame2 = new CubeGame(2);
        cubeGame3 = new CubeGame(2);
    }

    @Test
    public void testGameId() {
        assertEquals(1, cubeGame.getGameId());
    }

    @Test
    public void testCubes() {
        assertEquals(1, cubeGame.getCubes().size());
        assertEquals(rgbCubes, cubeGame.getCubes().get(0));
    }

    @Test
    public void testAddCube() {
        RGBCubes newCube = new RGBCubes(128, 128, 128);
        cubeGame.addRGBCube(newCube);
        assertEquals(2, cubeGame.getCubes().size());
        assertEquals(newCube, cubeGame.getCubes().get(1));
    }

    @Test
    public void testAddCube_emptyGame() {
        RGBCubes Cube1 = new RGBCubes(128, 128, 128);
        RGBCubes Cube2 = new RGBCubes(0, 128, 128);
        RGBCubes Cube3 = new RGBCubes(25, 50, 128);
        cubeGame2.addRGBCube(Cube1);
        cubeGame2.addRGBCube(Cube2);
        cubeGame2.addRGBCube(Cube2);

        assertEquals(3, cubeGame2.getCubes().size());
        assertEquals(Cube2, cubeGame2.getCubes().get(2));
    }

    @Test
    public void testSumOfRGBCubes() {
        RGBCubes Cube1 = new RGBCubes(50, 25, 5);
        RGBCubes Cube2 = new RGBCubes(0, 50, 10);
        RGBCubes Cube3 = new RGBCubes(25, 100, 0);
        cubeGame3.addRGBCube(Cube1);
        cubeGame3.addRGBCube(Cube2);
        cubeGame3.addRGBCube(Cube3);

        RGBCubes totalNumberOfRGBCubes = cubeGame3.sumOfRGBCubes();

        assertEquals(75, totalNumberOfRGBCubes.getRed());
        assertEquals(175, totalNumberOfRGBCubes.getGreen());
        assertEquals(15, totalNumberOfRGBCubes.getBlue());

    }

    @Test
    public void testMaxRequiredRGBCubes() {
    // Create a CubeGame object and add several RGBCubes objects to it
    CubeGame game = new CubeGame(1);
    game.addRGBCube(new RGBCubes(10, 20, 30));
    game.addRGBCube(new RGBCubes(20, 30, 40));
    game.addRGBCube(new RGBCubes(30, 40, 50));

    // Call the maxRequiredRGBCubes method on the CubeGame object
    RGBCubes maxCubes = game.maxRequiredRGBCubes();

    // Check that the number of red, green, and blue cubes in the returned RGBCubes object is correct
    assertEquals(30, maxCubes.getRed());
    assertEquals(40, maxCubes.getGreen());
    assertEquals(50, maxCubes.getBlue());
}


}