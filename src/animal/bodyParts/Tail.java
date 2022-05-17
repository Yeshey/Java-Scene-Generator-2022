package animal.bodyParts;

import animal.Fish;
import gui.Drawing;

import java.awt.*;

public class Tail {

    private Point coordsFish;
    private int sizeFish;
    private int sizeTail;
    private String colorHex;

    public Tail(Point coords, int size ,int sizeTail, String colorHex) {
        coordsFish = coords;
        this.sizeTail = sizeTail;
        this.colorHex = colorHex;
    }

    public void draw() {

        int[] polygonX = {coordsFish.x, coordsFish.x-10, coordsFish.x + 10};
        int[] polygonY = {coordsFish.y, coordsFish.y+10, coordsFish.y - 10};

        int polygonN = 3;
        Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
    }
}