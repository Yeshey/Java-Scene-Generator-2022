package animal;

import gui.LocatedRectangle;

import java.awt.*;
import utils.*;

public abstract class Fish implements LocatedRectangle{ // abstract
    private Point coords;
    private String colorHex;
    private double size;

    public Fish(Point coords, String colorHex, double size) {
        this.coords = coords;
        this.colorHex = colorHex;
        this.size = size;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    public Point getCoords(){ return coords; }
    public double getFishSize(){ return this.size; }
    public String getFishHex(){ return this.colorHex; }

    protected abstract void drawTail();
    protected abstract void drawEye();
    protected abstract void drawMouth();
    protected abstract void drawBody();

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