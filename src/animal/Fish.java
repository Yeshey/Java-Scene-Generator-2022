package animal;

import gui.Drawing;
import gui.LocatedRectangle;

import java.awt.*;
import utils.*;

public class Fish implements LocatedRectangle{ // abstract
    private Point coords;

    private String colorHex = "#7CFC00";
    private double size;

    public Fish(Point coords, String colorHex, double size) {
        this.coords = coords;

        this.colorHex = colorHex;
        this.size = size;
    }

    // getters
    public Point getCoords(){ return coords; }
    public double getFishSize(){ return this.size; }

    public void drawTail(){ }
    public void drawEye(){ }
    public void drawMouth(){ }

    public void draw() {
        drawTail();

        Drawing.pen().setColor(Color.decode(colorHex)); // HEX representation
        Drawing.pen().fillOval((int)(coords.x-Constants.FISH_NORMAL_DIAMETER*size/2), (int)(coords.y-Constants.FISH_NORMAL_DIAMETER*size/2), (int)(Constants.FISH_NORMAL_DIAMETER * size), (int)(Constants.FISH_NORMAL_DIAMETER * size));

        drawEye();
        drawMouth();
    }

    @Override
    public Point address() {
        Point myPoint = new Point(coords.x,coords.y);
        return myPoint;
    }

    @Override
    public int width() {
        return (int) (Constants.FISH_NORMAL_DIAMETER*size) + ((int)(Constants.FISH_NORMAL_DIAMETER*this.size*Constants.FISH_TAIL_X_SIZE) - (int)(Constants.FISH_NORMAL_DIAMETER*this.size/2));
    }

    @Override
    public int height() {
        return (int) (Constants.FISH_NORMAL_DIAMETER*size);
    }

}
