package animal;

import gui.Drawing;

import java.awt.*;

public class Gubby extends Fish {

    public Gubby(int coordsX, int coordsY, String colorHex, int size) {
        super(coordsX, coordsY, colorHex, size);
    }

    @Override
    public void buildTail() {
        setTail(100, "#7CFC00");
    }
}