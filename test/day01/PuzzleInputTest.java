package day01;

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
        assertDoesNotThrow(() -> PuzzleInput.readIntoListOfStrings("input_day01-01.txt"));
    }

    @Test
    @DisplayName("readIntoListOfStrings - passing missing input file - should throw exception")
    void readIntoListOfStrings_MissingInputFile_ThrowsException() {
        assertThrows(IOException.class, () -> PuzzleInput.readIntoListOfStrings("missing-file.txt"));

    }

    @Test
    @DisplayName("readIntoListOfStrings - passing example input file - returns expected list of Strings")
    void readIntoListOfStrings_ExampleInputFile_ReturnsExpectedListOfStrings() {
        List<String> puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfStrings("input_day01-01.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }

        assertEquals("1abc2", puzzleInputTest01.get(0));
        assertEquals("pqr3stu8vwx", puzzleInputTest01.get(1));
        assertEquals("a1b2c3d4e5f", puzzleInputTest01.get(2));
        assertEquals("treb7uchet", puzzleInputTest01.get(3));
    }

}

