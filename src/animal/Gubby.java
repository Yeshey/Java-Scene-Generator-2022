package animal;

import gui.Drawing;

import java.awt.*;

public class Gubby extends Fish {

    public Gubby(Point coords, String colorHex, double size) {
        super(coords, colorHex, size);
    }

    @Override
    public void buildTail() {
        setTail(100, "#7CFC00");
    }

    @Override
    public void buildMouth(){
        setMouth(100, "#7CFC00");
    }

    @Override
    public void buildEye(){
        setEye(100, "#7CFC00");
    }
}