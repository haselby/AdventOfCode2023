package day02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

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

    public static ArrayList<CubeGame> readIntoListOfCubeGames(String filename) throws IOException {

        ArrayList<CubeGame> listOfCubeGames = new ArrayList<>();
        ArrayList<String> listOfLines = day01.PuzzleInput.readIntoListOfStrings(filename);

        for (String line : listOfLines) {
            String[] parts = line.split(": ");
            Integer gameId = Integer.parseInt(parts[0].split(" ")[1]);
            String[] cubeDescriptions = parts[1].split("; ");
            List<RGBCubes> cubesList = new ArrayList<>();

            for (String cubeDescription : cubeDescriptions) {
                String[] colorCounts = cubeDescription.split(", ");
                RGBCubes rgbCubes = new RGBCubes(0, 0, 0);

                for (String colorCount : colorCounts) {
                    String[] countAndColor = colorCount.split(" ");
                    Integer count = Integer.parseInt(countAndColor[0]);
                    String color = countAndColor[1];

                    switch (color) {
                        case "red":
                            rgbCubes.setRed(count);
                            break;
                        case "green":
                            rgbCubes.setGreen(count);
                            break;
                        case "blue":
                            rgbCubes.setBlue(count);
                            break;
                    }
                }

                cubesList.add(rgbCubes);
            }

            CubeGame cubeGame = new CubeGame(gameId, cubesList);
            listOfCubeGames.add(cubeGame);
        }


        return listOfCubeGames;
    }


}
