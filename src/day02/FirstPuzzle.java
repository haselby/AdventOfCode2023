package day02;


import java.io.IOException;
import java.util.List;

public class FirstPuzzle {
    public static void main(String[] args) throws IOException {

        System.out.println("Starting Day 2, First Puzzle");
        List<CubeGame> listOfCubeGames = day02.PuzzleInput.readIntoListOfCubeGames("input_day02.txt");
        printSumOfCubesForEachGame(listOfCubeGames);

        System.out.println("Sum of Calibration Values: " + "TBD");
    }

    public static void printSumOfCubesForEachGame(List<CubeGame> listOfCubeGames) {

        for (CubeGame game : listOfCubeGames) {
            RGBCubes sum = game.SumOfRGBCubes();
            System.out.println("Game ID: " + game.getGameId() + ", Sum of Cubes by Color - Red: " + sum.getRed() + ", Green: " + sum.getGreen() + ", Blue: " + sum.getBlue());
        }
    }
}
