package animal;

import animal.bodyParts.Eye;
import animal.bodyParts.Mouth;
import animal.bodyParts.Tail;
import gui.Drawing;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Fish { // abstract

    private String name;
    private int coordsX;
    private int coordsY;
    private String colorHex = "#7CFC00";
    private int size;
    private Eye fEye;
    private Mouth fMouth;
    private Tail fTail;

    public Fish() {
    }

    public Fish(String name, int coordsX, int coordsY, String colorHex, int size) {
        this.name = name;
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;
        this.size = size;
    }

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
        Drawing.pen().setColor(Color.decode(colorHex)); // HEX representation
        Drawing.pen().fillOval(coordsX, coordsY, 60 * size, 50 * size);
        //Drawing.pen().drawLine(100, 100, 800, 800);
    }


}
