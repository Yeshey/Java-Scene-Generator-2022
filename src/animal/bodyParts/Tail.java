package animal.bodyParts;

import animal.Fish;
import gui.Drawing;
import utils.Constants;

import java.awt.*;

public class Tail {

    private Point coordsFish;
    private double fishSize;
    private int tailSize;
    private String colorHex;

    public Tail(Point coords, double fishSize ,int tailSize, String colorHex) {
        coordsFish = coords;
        this.fishSize = fishSize;
        this.tailSize = tailSize;
        this.colorHex = colorHex;
    }

    public void draw() {

        int tailXSize = (int)(Constants.FISH_NORMAL_DIAMETER*fishSize*Constants.FISH_TAIL_X_SIZE);
        int tailYSize = (int)(Constants.FISH_NORMAL_DIAMETER*fishSize*Constants.FISH_TAIL_Y_SIZE);

        Drawing.pen().setColor(Color.decode("#7a5230")); // HEX representation
        int[] polygonX = {coordsFish.x, coordsFish.x-tailXSize, coordsFish.x - tailXSize};
        int[] polygonY = {coordsFish.y, coordsFish.y+tailYSize/2, coordsFish.y - tailYSize/2};

        int polygonN = 3;
        Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
    }
}