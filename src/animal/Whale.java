package animal;

import gui.Drawing;
import utils.Constants;

import java.awt.*;

public class Whale extends Fish {

    public Whale(Point coords, String colorHex, double size) {
        super(coords, colorHex, size);
    }

    @Override
    public void drawBody() {
        Point point = new Point(100, 100);
        double size = getFishSize();

        Drawing.pen().setColor(Color.decode("#00FFFF")); // HEX representation
        Drawing.pen().fillOval((point.x), (point.y), (int)(Constants.FISH_NORMAL_DIAMETER * size), (int)(Constants.FISH_NORMAL_DIAMETER * size/2));
        //TODO change coordinates
    }

    @Override
    public void drawTail(){
        Point point = new Point(10, 100);


        int tailXSize = (int)(Constants.FISH_NORMAL_DIAMETER*getFishSize()*Constants.FISH_TAIL_X_SIZE);
        int tailYSize = (int)(Constants.FISH_NORMAL_DIAMETER*getFishSize()*Constants.FISH_TAIL_Y_SIZE);

        Drawing.pen().setColor(Color.decode("#00FFFF")); // HEX representation for Aqua blue
        int[] polygonX = {point.x, point.x-tailXSize, point.x - tailXSize};
        int[] polygonY = {point.y, point.y+tailYSize/5, point.y - tailYSize/5};
        //TODO change coordinates

        int polygonN = 3;
        Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
    }

    @Override
    public void drawEye(){
        Drawing.pen().setColor(Color.decode("#00FFFF")); // HEX representation for Aqua blue
        Drawing.pen().fillOval((int)(getCoords().x+Constants.FISH_NORMAL_DIAMETER*getFishSize()/5), (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER*getFishSize()/3.9), (int)(Constants.FISH_NORMAL_DIAMETER * getFishSize()/4), (int)(Constants.FISH_NORMAL_DIAMETER * getFishSize()/4));
    }
}
