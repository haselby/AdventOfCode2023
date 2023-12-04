package day02;


import java.io.IOException;
import java.util.List;

public class SecondPuzzle {
    public static void main(String[] args) throws IOException {

        System.out.println("Starting Day 2, First Puzzle");
        List<CubeGame> listOfCubeGames = day02.PuzzleInput.readIntoListOfCubeGames("input_day02.txt");

        int sumOfPower = sumOfPowerOfAllGames(listOfCubeGames);
        System.out.println("Sum of Power for all games: " + sumOfPower);
    }

    public static int sumOfPowerOfAllGames(List<CubeGame> listOfCubeGames){
        int sumOfPowers = 0;
        for (CubeGame game : listOfCubeGames) {
            RGBCubes maxCubes = game.maxRequiredRGBCubes();
            int powerOfCubeSets = maxCubes.getRed() * maxCubes.getGreen()* maxCubes.getBlue();
            sumOfPowers += powerOfCubeSets;
            System.out.println("Game ID: " + game.getGameId() + ", Power Of RGB Cube Sets: " + powerOfCubeSets);
        }
        return sumOfPowers;
    }


}
