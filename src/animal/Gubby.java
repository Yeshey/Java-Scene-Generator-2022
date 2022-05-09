package animal;

import gui.Drawing;

import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Gubby extends Fish {

    private int coordsX;
    private int coordsY;
    private String colorHex;

    public Gubby(int coordsX, int coordsY, String colorHex) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;
    }

    public void draw() {
        Drawing.pen().fillOval(coordsX,coordsY,30,30);
    }
}
