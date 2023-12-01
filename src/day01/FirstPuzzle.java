package day01;

import java.io.IOException;
import java.util.ArrayList;
public class FirstPuzzle {
    public static void main(String[] args) throws IOException {

        System.out.println("Starting Day 1, Puzzle 1");
        ArrayList<String> puzzleInput = PuzzleInput.readIntoListOfStrings("input_day01.txt");
        CalibrationDocument calibrationDocument = new CalibrationDocument(puzzleInput);
        Integer sumOfCalibrationValues = calibrationDocument.getSumOfCalibrationValues();
        System.out.println("Sum of Calibration Values: " + sumOfCalibrationValues);
    }
}
