package animal;

import gui.Drawing;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gubby extends Fish {

    private int coordsX;
    private int coordsY;
    private String colorHex;

    public Gubby(int coordsX, int coordsY, String colorHex) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;
    }

    public Gubby(int coordsX, int coordsY) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
    }

    public void draw() {
        Drawing.pen().setColor(Color.decode("#ff0000"));
        Drawing.pen().fillOval(coordsX,coordsY,30,30);
    }
}
