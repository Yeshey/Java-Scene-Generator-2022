package animal;

import animal.bodyParts.Eye;
import animal.bodyParts.Mouth;
import animal.bodyParts.Tail;
import gui.Drawing;
import gui.LocatedRectangle;

import java.awt.*;

public class Fish implements LocatedRectangle{ // abstract

    private String name;

    private Point coords;
    private int coordsX;
    private int coordsY;

    private String colorHex = "#7CFC00";
    private int size;
    private Eye fEye;
    private Mouth fMouth;
    private Tail fTail;

    public Fish(int coordsX, int coordsY, String colorHex, int size) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;

        this.coords.setLocation(coordsX, coordsY);

        this.colorHex = colorHex;
        this.size = size;

        buildTail();
        buildMouth();
        buildEye();
    }

    // getters
    public int getCoordsX(){ return coordsX; }
    public int getCoordsY(){ return coordsY; }
    // setters
    public void setTail(int size, String hex){
        fTail = new Tail(coords, this.size, size, hex); }
    public void setEye(int size, String hex){
        fEye = new Eye(size, hex); }
    public void setMouth(int size, String hex){
        fMouth = new Mouth(size, hex); }

    public void buildTail(){ }
    public void buildMouth(){ }
    public void buildEye(){ }

    public void draw() {
        fTail.draw();
        //fEye.draw(coordsX, coordsY, size);
        //fMouth.draw(coordsX, coordsY, size);

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
        return size*2;
    }

    @Override
    public int height() {
        return size*2;
    }

}
