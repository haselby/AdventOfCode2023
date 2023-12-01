package day01;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Unit Test Naming Standard:   UnitOfWork_StateUnderTest_ExpectedBehavior
// https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html
@DisplayName("Day 1, Part 1 - ImprovedCalibrationDocument Test")
public class ImprovedCalibrationDocumentTest {
    static ArrayList<String> puzzleInputTest02;

    @BeforeAll
    static void beforeAll() {

        puzzleInputTest02 = new ArrayList<>();

        try {
            puzzleInputTest02 = PuzzleInput.readIntoListOfStrings("input_day01-02.txt");

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
    @DisplayName("getSumOfCalibrationValues - passing example input file - returns expected test value")
    void getSumOfCalibrationValues_ExampleInputFile_ReturnsExpectedTestValue() {

        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        CalibrationDocument improvedCalibrationDocument = new ImprovedCalibrationDocument(puzzleInputTest02);

        assertEquals(281, improvedCalibrationDocument.getSumOfCalibrationValues());
    }

    @Test
    @DisplayName("extractCalibrationValues - passing second puzzle example input file- returns expected list of Integers")
    void extractCalibrationValues_SecondPuzzleExampleInputFile_ReturnsExpectedListOfIntegers() {

        ArrayList<Integer> listOfIntegers = new ArrayList<>();

        CalibrationDocument improvedCalibrationDocument = new ImprovedCalibrationDocument(puzzleInputTest02);
        listOfIntegers = improvedCalibrationDocument.extractListOfCalibrationValues();

//        assertEquals(29, listOfIntegers.get(0));
        assertEquals(83, listOfIntegers.get(1));
//        assertEquals(13, listOfIntegers.get(2));
//        assertEquals(24, listOfIntegers.get(3));
//        assertEquals(42, listOfIntegers.get(4));
//        assertEquals(14, listOfIntegers.get(5));
//        assertEquals(76, listOfIntegers.get(6));

    }

    //Create a unit test for ImprovedCalibrationDocument the tests spelledOutNumbers map
    @Test
    @DisplayName("spelledOutNumbers - passing second puzzle example input file - returns expected map of spelled out numbers")
    void spelledOutNumbers_ExampleInputFile_ReturnsExpectedMapOfSpelledOutNumbers() {

        ImprovedCalibrationDocument improvedCalibrationDocument = new ImprovedCalibrationDocument(puzzleInputTest02);

        assertEquals(1, improvedCalibrationDocument.spelledOutNumbers.get("one"));
        assertEquals(2, improvedCalibrationDocument.spelledOutNumbers.get("two"));
        assertEquals(3, improvedCalibrationDocument.spelledOutNumbers.get("three"));
        assertEquals(4, improvedCalibrationDocument.spelledOutNumbers.get("four"));
        assertEquals(5, improvedCalibrationDocument.spelledOutNumbers.get("five"));
        assertEquals(6, improvedCalibrationDocument.spelledOutNumbers.get("six"));
        assertEquals(7, improvedCalibrationDocument.spelledOutNumbers.get("seven"));
        assertEquals(8, improvedCalibrationDocument.spelledOutNumbers.get("eight"));
        assertEquals(9, improvedCalibrationDocument.spelledOutNumbers.get("nine"));
    }

    //Create a unit test for searchStringForNumber
    @Test
    @DisplayName("searchStringForTrailingNumber - given troublesome examples - returns expected number")
    void searchStringForTrailingNumber_GivenTroublesomeExamples_ReturnsExpectedNumber() {

        ImprovedCalibrationDocument improvedCalibrationDocument = new ImprovedCalibrationDocument(puzzleInputTest02);

        assertEquals(1, improvedCalibrationDocument.searchStringForTrailingNumber("one"));
        assertEquals(2, improvedCalibrationDocument.searchStringForTrailingNumber("wertwo"));
        assertEquals(3, improvedCalibrationDocument.searchStringForTrailingNumber("three"));
        assertEquals(4, improvedCalibrationDocument.searchStringForTrailingNumber("jfdksdfjfour"));
        assertEquals(5, improvedCalibrationDocument.searchStringForTrailingNumber("4five"));
        assertEquals(6, improvedCalibrationDocument.searchStringForTrailingNumber("six"));
        assertEquals(7, improvedCalibrationDocument.searchStringForTrailingNumber("threeseven"));
        assertEquals(8, improvedCalibrationDocument.searchStringForTrailingNumber("eight"));
        assertEquals(9, improvedCalibrationDocument.searchStringForTrailingNumber("nine"));
        assertEquals(9, improvedCalibrationDocument.searchStringForTrailingNumber("sevenine"));
    }

}

