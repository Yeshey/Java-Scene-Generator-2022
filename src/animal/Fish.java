package animal;

import animal.bodyParts.Eye;
import animal.bodyParts.Mouth;
import animal.bodyParts.Tail;
import gui.Drawing;
import gui.LocatedRectangle;

import java.awt.*;

import utils.*;



public class Fish implements LocatedRectangle{ // abstract
    private Point coords;

    private String colorHex = "#7CFC00";
    private double size;
    private Eye fEye;
    private Mouth fMouth;
    private Tail fTail;

    public Fish(Point coords, String colorHex, double size) {
        this.coords = coords;

        this.colorHex = colorHex;
        this.size = size;

        buildTail();
        //buildMouth();
        //buildEye();
    }

    // getters
    public int getCoordsX(){ return coords.x; }
    public int getCoordsY(){ return coords.y; }
    // setters
    public void setTail(int tailSize, String hex){
        fTail = new Tail(coords, this.size, tailSize, hex); }
    //public void setEye(int size, String hex){
    //    fEye = new Eye(coords, this.size, eyeSize, hex); }
    //public void setMouth(int size, String hex){
    //    fMouth = new Mouth(coords, this.size, tailSize, hex); }

    public void buildTail(){ }
    public void buildMouth(){ }
    public void buildEye(){ }

    public void draw() {
        fTail.draw();
        //fEye.draw();
        //fMouth.draw();

        Drawing.pen().setColor(Color.decode(colorHex)); // HEX representation
        Drawing.pen().fillOval((int)(coords.x-Constants.FISH_NORMAL_DIAMETER*size/2), (int)(coords.y-Constants.FISH_NORMAL_DIAMETER*size/2), (int)(Constants.FISH_NORMAL_DIAMETER * size), (int)(Constants.FISH_NORMAL_DIAMETER * size));
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
