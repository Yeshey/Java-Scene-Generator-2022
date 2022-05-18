package animal;

import gui.LocatedRectangle;

import java.awt.*;
import utils.*;

public class Fish implements LocatedRectangle{ // abstract
    private Point coords;

    private String colorHex; /* = "#7CFC00" */
    private double size;

    public Fish(Point coords, String colorHex, double size) {
        this.coords = coords;

        this.colorHex = colorHex;
        this.size = size;
    }

    // getters
    public Point getCoords(){ return coords; }
    public double getFishSize(){ return this.size; }
    public String getFishHex(){ return this.colorHex; }

    public void drawTail(){ }
    public void drawEye(){ }
    public void drawMouth(){ }
    public void drawBody() {}

    public void draw() {
        drawTail();
        drawBody();
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
        return (int) (Constants.FISH_NORMAL_DIAMETER_X *size) + ((int)(Constants.FISH_NORMAL_DIAMETER_X *this.size*Constants.FISH_TAIL_X_SIZE) - (int)(Constants.FISH_NORMAL_DIAMETER_X *this.size/2));
    }

    @Override
    public int height() {
        return (int) (Constants.FISH_NORMAL_DIAMETER_Y *size);
    }

}