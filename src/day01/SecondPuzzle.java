package day01;

import java.io.IOException;
import java.util.ArrayList;

public class SecondPuzzle {
    public static void main(String[] args) throws IOException {

        System.out.println("Starting Day 1, Puzzle 2");
        ArrayList<String> puzzleInput = PuzzleInput.readIntoListOfStrings("input_day01.txt");
        CalibrationDocument improvedCalibrationDocument = new ImprovedCalibrationDocument(puzzleInput);
        Integer sumOfCalibrationValues = improvedCalibrationDocument.getSumOfCalibrationValues();
        System.out.println("Sum of Improved Calibration Values: " + sumOfCalibrationValues);
    }
}
