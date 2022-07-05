package animal;

import java.awt.*;

import gui.Drawing;
import utils.Constants;

public class Shark extends Fish {

    public Shark(Point coords, String colorHex, int size) {
        super(coords, colorHex, size);
    }
    
    @Override
    protected void drawTail(){
        int tailXSize = (int)(Constants.FISH_NORMAL_DIAMETER_X *getFishSize()*Constants.FISH_TAIL_X_SIZE);
        int tailYSize = (int)(Constants.FISH_NORMAL_DIAMETER_X *getFishSize()*Constants.FISH_TAIL_Y_SIZE*1.5);

        Drawing.pen().setColor(Color.decode("#7a5230")); // HEX representation
        int[] polygonX = {getCoords().x, getCoords().x-tailXSize, getCoords().x - tailXSize};
        int[] polygonY = {getCoords().y, getCoords().y+tailYSize/2, getCoords().y - tailYSize/2};

        int polygonN = 3;
        Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);

    }

    @Override
    protected void drawEye() {
        Drawing.pen().setColor(Color.decode("#d92518")); // HEX representation<
        Drawing.pen().fillOval((int)(getCoords().x+Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/5), (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/3.9), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()/4), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()/4));

        Drawing.pen().setColor(Color.decode("#000000"));
        Drawing.pen().drawLine(getCoords().x+115, getCoords().y-26, getCoords().x+70, getCoords().y-90);
    }

    @Override
    protected void drawMouth() {

    }

    @Override
	protected void drawBody() {
        Drawing.pen().setColor(Color.decode(getFishHex())); // HEX representation
        Drawing.pen().fillOval((int)(getCoords().x-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/2), (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/2), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()));
    }

	@Override
    public Point address() {
        Point myPoint = new Point(getCoords().x,getCoords().y);
        return myPoint;
    }

    @Override
    public int width() {
        return (int) (Constants.FISH_NORMAL_DIAMETER_X *getFishSize()) + ((int)(Constants.FISH_NORMAL_DIAMETER_X *this.getFishSize()*Constants.FISH_TAIL_X_SIZE) - (int)(Constants.FISH_NORMAL_DIAMETER_X *this.getFishSize()/2));
    }

    @Override
    public int height() {
        return (int) (Constants.FISH_NORMAL_DIAMETER_Y *getFishSize());
    }
}