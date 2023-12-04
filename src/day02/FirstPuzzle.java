package day02;


import java.io.IOException;
import java.util.List;

public class FirstPuzzle {
    public static void main(String[] args) throws IOException {

        System.out.println("Starting Day 2, First Puzzle");
        List<CubeGame> listOfCubeGames = day02.PuzzleInput.readIntoListOfCubeGames("input_day02.txt");
        printMaxRequiredCubesForEachGame(listOfCubeGames);

        // RGBCubes maxCubes = game.maxRequiredRGBCubes();

        Integer sumOfGameIds = FirstPuzzle.sumOfGameIDsOfPossibleGames(listOfCubeGames, 12,13,14);
        System.out.println("Sum of Game Ids for possible games: " + sumOfGameIds);
    }

    public static void printMaxRequiredCubesForEachGame(List<CubeGame> listOfCubeGames) {

        for (CubeGame game : listOfCubeGames) {
            RGBCubes maxCubes = game.maxRequiredRGBCubes();
            System.out.println("Game ID: " + game.getGameId() + ", Max Cubes by Color - Red: " + maxCubes.getRed() + ", Green: " + maxCubes.getGreen() + ", Blue: " + maxCubes.getBlue());
        }
    }

    public static int sumOfGameIDsOfPossibleGames(List<CubeGame> listOfCubeGames, int availableRedCubes, int availableGreenCubes, int availableBlueCubes){
        int sumOfGameIds = 0;
        for (CubeGame game : listOfCubeGames) {
            RGBCubes maxCubes = game.maxRequiredRGBCubes();
            if ((maxCubes.getRed() <= availableRedCubes) && (maxCubes.getGreen() <= availableGreenCubes) && (maxCubes.getBlue() <= availableBlueCubes)) {
                sumOfGameIds += game.getGameId();
                System.out.println("Game ID: " + game.getGameId() + ", Sum of Cubes by Color - Red: " + maxCubes.getRed() + ", Green: " + maxCubes.getGreen() + ", Blue: " + maxCubes.getBlue());
            }
        }
        return sumOfGameIds;
    }
}

