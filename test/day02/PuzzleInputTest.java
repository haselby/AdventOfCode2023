package day02;

import day01.PuzzleInput;
import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Unit Test Naming Standard:   UnitOfWork_StateUnderTest_ExpectedBehavior
// https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html

@DisplayName("Day 1, Part 1 - PuzzleInput Test")
public class PuzzleInputTest {
    @BeforeAll
    static void beforeAll() {

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
    @DisplayName("readIntoListOfStrings - passing example input file - should not throw exception")
    void readIntoListOfStrings_ExampleInputFile_ShouldNotThrowException() {
        assertDoesNotThrow(() -> day01.PuzzleInput.readIntoListOfStrings("input_day02-01.txt"));
    }

    @Test
    @DisplayName("readIntoListOfStrings - passing missing input file - should throw exception")
    void readIntoListOfStrings_MissingInputFile_ThrowsException() {
        assertThrows(IOException.class, () -> day01.PuzzleInput.readIntoListOfStrings("missing-file.txt"));

    }

    @Test
    @DisplayName("readIntoListOfStrings - passing example input file - returns expected list of Strings")
    void readIntoListOfStrings_ExampleInputFile_ReturnsExpectedListOfStrings() {
        List<String> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfStrings("input_day02-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green", puzzleInputTest01.get(0));
        assertEquals("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue", puzzleInputTest01.get(1));
        assertEquals("Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red", puzzleInputTest01.get(2));
        assertEquals("Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red", puzzleInputTest01.get(3));
        assertEquals("Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green", puzzleInputTest01.get(4));
    }

    @Test
    @DisplayName("readIntoListOfCubeGames - passing example input file - should not throw exception")
    void readIntoListOfCubeGames_ExampleInputFile_ShouldNotThrowException() {
        assertDoesNotThrow(() -> day02.PuzzleInput.readIntoListOfCubeGames("input_day02-01.txt"));
    }

    @Test
    @DisplayName("readIntoListOfCubeGames - passing example input file - returns expected gameIDs")
    void readIntoListOfCubeGames_ExampleInputFile_ReturnsExpectedGameIDs() {

        // Call readIntoListOfCubeGames method
        List<CubeGame> returnedCubeGames = new ArrayList<>();
        try {
            returnedCubeGames = day02.PuzzleInput.readIntoListOfCubeGames("input_day02-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Compare gameIDs
        assertEquals(1, returnedCubeGames.get(0).getGameId());
        assertEquals(2, returnedCubeGames.get(1).getGameId());
        assertEquals(3, returnedCubeGames.get(2).getGameId());
        assertEquals(4, returnedCubeGames.get(3).getGameId());
        assertEquals(5, returnedCubeGames.get(4).getGameId());

    }

    @Test
    @DisplayName("readIntoListOfCubeGames - passing example input file - returns expected number of RGBCubes sets")
    void readIntoListOfCubeGames_ExampleInputFile_ReturnsExpectedNumberOfRGBCubesSets() {

        // Call readIntoListOfCubeGames method
        List<CubeGame> returnedCubeGames = new ArrayList<>();
        try {
            returnedCubeGames = day02.PuzzleInput.readIntoListOfCubeGames("input_day02-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Compare gameIDs
        assertEquals(3, returnedCubeGames.get(0).getCubes().size());
        assertEquals(3, returnedCubeGames.get(1).getCubes().size());
        assertEquals(3, returnedCubeGames.get(2).getCubes().size());
        assertEquals(3, returnedCubeGames.get(3).getCubes().size());
        assertEquals(2, returnedCubeGames.get(4).getCubes().size());

    }

    @Test
    @DisplayName("readIntoListOfCubeGames - passing example input file - returns expected number of RGBCubes sets")
    void readIntoListOfCubeGames_ExampleInputFile_ReturnsExpectedNumberOfRGBCubesInASpecificSet() {

        // Call readIntoListOfCubeGames method
        List<CubeGame> returnedCubeGames = new ArrayList<>();
        try {
            returnedCubeGames = day02.PuzzleInput.readIntoListOfCubeGames("input_day02-01.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Compare cube colors in first game, in first set to expected values
        assertEquals(4, returnedCubeGames.get(0).getCubes().get(0).getRed());
        assertEquals(0, returnedCubeGames.get(0).getCubes().get(0).getGreen());
        assertEquals(3, returnedCubeGames.get(0).getCubes().get(0).getBlue());

        // Compare cube colors in first game, in second set to expected values
        assertEquals(1, returnedCubeGames.get(0).getCubes().get(1).getRed());
        assertEquals(2, returnedCubeGames.get(0).getCubes().get(1).getGreen());
        assertEquals(6, returnedCubeGames.get(0).getCubes().get(1).getBlue());

        // Compare cube colors in second game, in first set to expected values
        assertEquals(0, returnedCubeGames.get(1).getCubes().get(0).getRed());
        assertEquals(2, returnedCubeGames.get(1).getCubes().get(0).getGreen());
        assertEquals(1, returnedCubeGames.get(1).getCubes().get(0).getBlue());



    }


}

