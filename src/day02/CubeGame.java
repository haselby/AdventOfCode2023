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

    public RGBCubes sumOfRGBCubes() {
        RGBCubes rgbCubeTotal = new RGBCubes(0,0,0);
        for (RGBCubes cube : this.rgbCubesList) {
            rgbCubeTotal.add(cube);
        }
        return rgbCubeTotal;
    }

    public RGBCubes maxRequiredRGBCubes () {
        RGBCubes rgbCubeMax = new RGBCubes(0,0,0);
        for (RGBCubes cube : this.rgbCubesList) {
            if (rgbCubeMax.getRed() <= cube.getRed()){
                rgbCubeMax.setRed(cube.getRed());
            }
            if (rgbCubeMax.getGreen() <= cube.getGreen()){
                rgbCubeMax.setGreen(cube.getGreen());
            }
            if (rgbCubeMax.getBlue() <= cube.getBlue()){
                rgbCubeMax.setBlue(cube.getBlue());
            }
        }
        return rgbCubeMax;
    }

}
