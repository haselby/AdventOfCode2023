package day02;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("FirstPuzzleTest")
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
    @DisplayName("printMaxRequiredCubesForEachGame - passing example list of CubeGames - prints expected sums of cubes")
    void printMaxRequiredCubesForEachGame_ExampleListOfCubeGames_PrintsExpectedSumsOfCubes() {
        FirstPuzzle.printMaxRequiredCubesForEachGame(returnedCubeGames);
    }

    @Test
    @DisplayName("sumOfGameIDsOfPossibleGames - passing example list of CubeGames - prints expected sums of Game IDs")
    void sumOfGameIDsOfPossibleGames_ExampleListOfCubeGames_PrintsExpectedSumOfGameIDs() {
        Integer sumOfGameIds = FirstPuzzle.sumOfGameIDsOfPossibleGames(returnedCubeGames, 12,13,14);
        assertEquals(8, sumOfGameIds);
    }
}