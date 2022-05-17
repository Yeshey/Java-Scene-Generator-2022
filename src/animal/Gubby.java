package animal;

import gui.Drawing;

import java.awt.*;

public class Gubby extends Fish {

    public Gubby(int coordsX, int coordsY, String colorHex, int size) {
        super(coordsX, coordsY, colorHex, size);
    }

    public void draw() {
        Drawing.pen().setColor(Color.decode("#7CCC30"));
        Drawing.pen().fillOval(getCoordsX(),getCoordsY(),30,30);
    }
}
