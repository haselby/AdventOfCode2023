package day02;

import java.util.ArrayList;
import java.util.List;

public class CubeGame {
    private Integer gameId;
    private List<RGBCubes> rgbCubesList;

    public CubeGame(Integer gameId, List<RGBCubes> cubesList) {
        this.gameId = gameId;
        this.rgbCubesList = cubesList;
    }

    public CubeGame(Integer gameId) {
        this.gameId = gameId;
        // This works, but I need to read up on List vs ArrayList in Java
        this.rgbCubesList = new ArrayList<RGBCubes>();
    }

    public Integer getGameId() {
        return gameId;
    }

    public List<RGBCubes> getCubes() {
        return rgbCubesList;
    }

    public void addRGBCube(RGBCubes rgbCube) {
        this.rgbCubesList.add(rgbCube);
    }

    public RGBCubes SumOfRGBCubes () {
        RGBCubes rgbCubeTotal = new RGBCubes(0,0,0);
        for (RGBCubes cube : this.rgbCubesList) {
            rgbCubeTotal.add(cube);
        }
        return rgbCubeTotal;
    }

}
