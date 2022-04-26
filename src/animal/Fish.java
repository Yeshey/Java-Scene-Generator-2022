package animal;

import drawingTool.Drawing;

import java.awt.*;
import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Fish { // abstract

    private String name;
    private int coordsX;
    private int coordsY;
    private String colorHex;
    private int size;

    private ArrayList<Point2D.Double> coordinates;


    public Fish(int coordsX, int coordsY) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
    }

    public Fish(int coordsX, int coordsY, String colorHex) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;

        //coordinates.add();
    }

    public void draw() {
        //Drawing.pen().setColor(Color.decode("#7CFC00")); // HEX representation
        Drawing.pen().fillOval(coordsX, coordsY, 60, 50);
    }
}
