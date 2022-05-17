package animal.bodyParts;

import animal.Fish;
import gui.Drawing;

public class Tail extends Fish {

    private int size;
    private String colorHex;

    public Tail(int size, String colorHex) {
        this.size = size;
        this.colorHex = colorHex;
    }

    public Tail() {
    }

    public void draw() {
        int xCoords = getCoordsX();
        int yCoords = getCoordsY();

        int[] polygonX = {xCoords, xCoords - 10, xCoords - 10};
        int[] polygonY = {yCoords, yCoords + 10, yCoords - 10};
        int polygonN = 3;
        Drawing.pen().drawPolygon(polygonX, polygonY, polygonN);
    }
}
