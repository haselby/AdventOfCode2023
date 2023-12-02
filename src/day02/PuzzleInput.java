package day02;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PuzzleInput {
    public static ArrayList<String> readIntoListOfStrings(String filename) throws IOException {

        ArrayList<String> listOfStrings = new ArrayList<>();

        // Find input file in resources folder: /resources
        InputStream inputStream = PuzzleInput.class.getResourceAsStream("/" + filename);
        if (inputStream == null) throw new IOException("Input filename does not exist!");

        try (BufferedReader puzzleInputFile = new BufferedReader(new InputStreamReader(inputStream))) {
            String input;
            while ((input = puzzleInputFile.readLine()) != null) {
                listOfStrings.add(input);
            }

        } catch (IOException e) {
            throw new IOException();
        }

        return listOfStrings;
    }
}
