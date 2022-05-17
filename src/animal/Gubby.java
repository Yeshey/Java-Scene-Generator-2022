package animal;

import gui.Drawing;
import utils.Constants;

import java.awt.*;

public class Gubby extends Fish {

    public Gubby(Point coords, String colorHex, double size) {
        super(coords, colorHex, size);
    }

    @Override
    public void drawTail(){

        int tailXSize = (int)(Constants.FISH_NORMAL_DIAMETER*getFishSize()*Constants.FISH_TAIL_X_SIZE);
        int tailYSize = (int)(Constants.FISH_NORMAL_DIAMETER*getFishSize()*Constants.FISH_TAIL_Y_SIZE);

        Drawing.pen().setColor(Color.decode("#7a5230")); // HEX representation
        int[] polygonX = {getCoords().x, getCoords().x-tailXSize, getCoords().x - tailXSize};
        int[] polygonY = {getCoords().y, getCoords().y+tailYSize/2, getCoords().y - tailYSize/2};

        int polygonN = 3;
        Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
    }

    @Override
    public void drawEye(){
        Drawing.pen().setColor(Color.decode("#7EC8E3")); // HEX representation
        Drawing.pen().fillOval((int)(getCoords().x+Constants.FISH_NORMAL_DIAMETER*getFishSize()/5), (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER*getFishSize()/3.9), (int)(Constants.FISH_NORMAL_DIAMETER * getFishSize()/4), (int)(Constants.FISH_NORMAL_DIAMETER * getFishSize()/4));
    }

    @Override
    public void drawMouth(){
        // no mouth
    }
}