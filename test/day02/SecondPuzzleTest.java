package day02;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("SecondPuzzleTest")
public class SecondPuzzleTest {

    static List<CubeGame> returnedCubeGames = new ArrayList<>();
    @BeforeAll
    static void beforeAll() {
        try {
            returnedCubeGames = PuzzleInput.readIntoListOfCubeGames("input_day02-01.txt");
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
    @DisplayName("sumOfPowerOfAllGames - passing example list of CubeGames - prints expected sums of Game IDs")
    void sumOfPowerOfAllGames_ExampleListOfCubeGames_PrintsExpectedSumOfGameIDs() {
        int sumOfPower = FirstPuzzle.sumOfPowerOfAllGames(returnedCubeGames);
        assertEquals(2286, sumOfPower);
    }
}