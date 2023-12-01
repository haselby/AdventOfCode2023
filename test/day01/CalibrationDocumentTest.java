package day01;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Unit Test Naming Standard:   UnitOfWork_StateUnderTest_ExpectedBehavior
// https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
@DisplayName("Day 1, Part 1 - CalibrationDocument Test")
public class CalibrationDocumentTest {

    static ArrayList<String> puzzleInputTest01;

    @BeforeAll
    static void beforeAll() {
        puzzleInputTest01 = new ArrayList<>();

        try {
            puzzleInputTest01 = PuzzleInput.readIntoListOfStrings("input_day01-01.txt");

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
    @DisplayName("readIntoListOfStrings - passing example input file - returns expected list of Strings")
    void readIntoListOfStrings_ExampleInputFile_ReturnsExpectedListOfStrings() {

        assertEquals("1abc2", puzzleInputTest01.get(0));
        assertEquals("pqr3stu8vwx", puzzleInputTest01.get(1));
        assertEquals("a1b2c3d4e5f", puzzleInputTest01.get(2));
        assertEquals("treb7uchet", puzzleInputTest01.get(3));
    }

    @Test
    @DisplayName("extractCalibrationValues - passing example input file - returns expected list of Integers")
    void extractCalibrationValues_ExampleInputFile_ReturnsExpectedListOfIntegers() {

        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        CalibrationDocument calibrationDocument = new CalibrationDocument(puzzleInputTest01);
        listOfIntegers = calibrationDocument.extractListOfCalibrationValues();

        assertEquals(12, listOfIntegers.get(0));
        assertEquals(38, listOfIntegers.get(1));
        assertEquals(15, listOfIntegers.get(2));
        assertEquals(77, listOfIntegers.get(3));
    }

    @Test
    @DisplayName("getSumOfCalibrationValues - passing example input file - returns expected test value")
    void getSumOfCalibrationValues_ExampleInputFile_ReturnsExpectedTestValue() {

        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        CalibrationDocument calibrationDocument = new CalibrationDocument(puzzleInputTest01);

        assertEquals(142, calibrationDocument.getSumOfCalibrationValues());
    }
}
