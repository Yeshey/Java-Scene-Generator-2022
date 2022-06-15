package animal;

import gui.LocatedRectangle;

import java.awt.*;

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
}