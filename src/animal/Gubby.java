package animal;

import gui.Drawing;

import java.awt.*;
import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Gubby extends Fish {

    public Gubby(int coordsX, int coordsY, String colorHex) {
        super(coordsX, coordsY, colorHex);
    }

    public void draw() {
        Drawing.pen().setColor(Color.decode("#7CCC30"));
        Drawing.pen().fillOval(getCoordX(),getCoordY(),30,30);
    }
}
