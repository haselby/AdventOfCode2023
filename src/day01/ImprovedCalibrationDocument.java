package day01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ImprovedCalibrationDocument extends CalibrationDocument {

    Map<String, Integer> spelledOutNumbers = new HashMap<>();
    ImprovedCalibrationDocument(ArrayList<String> puzzleInput) {
        super(puzzleInput);

        // Populate spelledOutNumbers
        spelledOutNumbers.put("one", 1);
        spelledOutNumbers.put("two", 2);
        spelledOutNumbers.put("three", 3);
        spelledOutNumbers.put("four", 4);
        spelledOutNumbers.put("five", 5);
        spelledOutNumbers.put("six", 6);
        spelledOutNumbers.put("seven", 7);
        spelledOutNumbers.put("eight", 8);
        spelledOutNumbers.put("nine", 9);
    }

    @Override
    ArrayList<Integer> extractListOfCalibrationValues() {
        ArrayList<Integer> listOfIntegers = new ArrayList<>();
        for (String line : amendedCalibrationDocument) {
            String[] splitLine = line.split("");
            Integer firstInteger = null;
            Integer secondInteger = null;
            String stringPotentiallyContainingNumber = null;
            for (int i = 0; i < splitLine.length; i++) {
                // check if splitLine[i] is a digit
                if (splitLine[i].matches("\\d")) {
                    // set firstInteger = splitLine[i] is it is null using ternary operator
                    if(firstInteger == null){
                        firstInteger = Integer.valueOf(splitLine[i]);
                    }
                    secondInteger = Integer.valueOf(splitLine[i]);
                    // reset stringPotentiallyContainingNumber when you find a digit;
                    stringPotentiallyContainingNumber = null;
                }
                // check if splitLine[i] is a letter
                else if (splitLine[i].matches("[a-z]")) {
                    // Append splitLine[i] to stringPotentiallyContainingNumber
                    stringPotentiallyContainingNumber = (stringPotentiallyContainingNumber == null) ? splitLine[i] : stringPotentiallyContainingNumber + splitLine[i];
                    // check if stringPotentiallyContainingNumber is a key in spelledOutNumbers
                    Integer potentialDigit = searchStringForTrailingNumber(stringPotentiallyContainingNumber);
                    if (potentialDigit != null) {
                        if (firstInteger == null) {
                            firstInteger = potentialDigit;
                        }
                        secondInteger = potentialDigit;
                    }

                }
            }
            int twoDigitValue = (firstInteger * 10) + secondInteger;
            listOfIntegers.add(twoDigitValue);
        }

        return listOfIntegers;
    }

    Integer searchStringForTrailingNumber(String searchString) {
        for (String key : spelledOutNumbers.keySet()) {
            if (searchString.matches(".*" + key)) {
                return spelledOutNumbers.get(key);
            }
        }
        return null;
    }

}
