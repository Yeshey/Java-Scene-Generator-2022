package animal;

import gui.Drawing;
import utils.Constants;

import java.awt.Color;
import java.awt.Point;

public class Guppy extends Fish {

    public Guppy(Point coords, String colorHex, double size) {
        super(coords, colorHex, size);
    }

    @Override
    public void drawBody(){
        Drawing.pen().setColor(Color.decode(getFishHex())); // HEX representation
        Drawing.pen().fillOval((int)(getCoords().x-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/2), (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/2), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()));
    }

    @Override
    protected void drawTail(){
        int tailXSize = (int)(Constants.FISH_NORMAL_DIAMETER_X *getFishSize()*Constants.FISH_TAIL_X_SIZE);
        int tailYSize = (int)(Constants.FISH_NORMAL_DIAMETER_X *getFishSize()*Constants.FISH_TAIL_Y_SIZE);

        Drawing.pen().setColor(Color.decode("#7a5230")); // HEX representation
        int[] polygonX = {getCoords().x, getCoords().x-tailXSize, getCoords().x - tailXSize};
        int[] polygonY = {getCoords().y, getCoords().y+tailYSize/2, getCoords().y - tailYSize/2};

        int polygonN = 3;
        Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
    }

    @Override
    public void drawEye(){
        Drawing.pen().setColor(Color.decode("#7EC8E3")); // HEX representation
        Drawing.pen().fillOval((int)(getCoords().x+Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/5), (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/3.9), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()/4), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()/4));
    }

    @Override
    public void drawMouth(){
        // no mouth
    }
}