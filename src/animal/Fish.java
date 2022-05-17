package animal;

import animal.bodyParts.Eye;
import animal.bodyParts.Mouth;
import animal.bodyParts.Tail;
import gui.Drawing;
import gui.LocatedRectangle;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Fish implements LocatedRectangle{ // abstract

    private String name;
    private int coordsX;
    private int coordsY;
    private String colorHex = "#7CFC00";
    private int size;
    private Eye fEye;
    private Mouth fMouth;
    private Tail fTail;

    // remove all cnstructurs we're not using ------------------
    public Fish() {
    }

    public Fish(int coordsX, int coordsY, String colorHex, int size) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;
        this.size = size;
    }

    public int getCoordX(){
        return coordsX;
    }
    public int getCoordY(){
        return coordsY;

    }

    public void draw() {

        //Drawing.pen().setColor(Color.decode("#7CFC00")); // HEX representation
        Drawing.pen().setColor(Color.decode(colorHex)); // HEX representation
        Drawing.pen().fillOval(coordsX, coordsY, 60 * size, 50 * size);
        //Drawing.pen().drawLine(100, 100, 800, 800);
    }

    @Override
    public Point address() {
        Point myPoint = new Point(coordsX,coordsY); 
        return myPoint;
    }

    @Override
    public int width() {
        return size;
    }

    @Override
    public int height() {
        return size;
    }

}
