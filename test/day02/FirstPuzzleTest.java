package day02;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@DisplayName("Day 2, Part 1 - FirstPuzzleTest")
public class FirstPuzzleTest {

    static List<CubeGame> returnedCubeGames = new ArrayList<>();
    @BeforeAll
    static void beforeAll() {
        try {
            returnedCubeGames = day02.PuzzleInput.readIntoListOfCubeGames("input_day02-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    void beforeEach() {

    }

    @AfterEach
    void afterEach() {

    }

    @AfterAll
    static void afterAll() {

    }

    @Test
    @DisplayName("printSumOfCubesForEachGame - passing example list of CubeGames - prints expected sums of cubes")
    void printSumOfCubesForEachGame_ExampleListOfCubeGames_PrintsExpectedSumsOfCubes() {
        FirstPuzzle.printSumOfCubesForEachGame(returnedCubeGames);
    }
}