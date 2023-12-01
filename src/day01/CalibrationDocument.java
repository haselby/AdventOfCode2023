package day01;

import java.util.ArrayList;

public class CalibrationDocument {
    ArrayList<String> amendedCalibrationDocument;
    CalibrationDocument(ArrayList<String> puzzleInput) {
        amendedCalibrationDocument = puzzleInput;
    }

    public Integer getSumOfCalibrationValues() {
        ArrayList<Integer> listOfCalibrationValues = extractListOfCalibrationValues();
        int sumOfCalibrationValues = 0;
        for (Integer calibrationValue : listOfCalibrationValues) {
            sumOfCalibrationValues += calibrationValue;
        }
        return sumOfCalibrationValues;
    }

    ArrayList<Integer> extractListOfCalibrationValues() {
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        for (String line : amendedCalibrationDocument) {
            String[] splitLine = line.split("");
            String firstInteger = null;
            String secondInteger = null;
            for (int i = 0; i < splitLine.length; i++) {
                // check if splitLine[i] is a digit
                if (splitLine[i].matches("\\d")) {
                    // set firstInteger = splitLine[i] is it is null using ternary operator
                    firstInteger = (firstInteger == null) ? splitLine[i] : firstInteger;
                    secondInteger = splitLine[i];
                }
            }
            int twoDigitValue = Integer.parseInt(firstInteger+secondInteger);
            listOfIntegers.add(twoDigitValue);
        }
        return listOfIntegers;
    }
}

