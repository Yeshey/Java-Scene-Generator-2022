package animal;

import gui.Drawing;
import utils.Constants;

import java.awt.*;

public class Whale extends Fish {

    public Whale(Point coords, String colorHex, double size) {
        super(coords, colorHex, size);
    }

    @Override
    protected void drawBody(){
        Drawing.pen().setColor(Color.decode(getFishHex())); // HEX representation
        Drawing.pen().fillOval((int)(getCoords().x-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/2),
                (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER_Y *getFishSize()/2),
                (int)(Constants.FISH_NORMAL_DIAMETER_X*2 * getFishSize()+2),
                (int)(Constants.FISH_NORMAL_DIAMETER_Y * getFishSize())+2);
    }

    @Override
    protected void drawTail(){

        int tailXSize = (int)(Constants.FISH_NORMAL_DIAMETER_X *getFishSize()*Constants.FISH_TAIL_X_SIZE+30);
        int tailYSize = (int)(Constants.FISH_NORMAL_DIAMETER_Y *getFishSize()*Constants.FISH_TAIL_Y_SIZE+30);

        Drawing.pen().setColor(Color.decode(getFishHex())); // HEX representation for Aqua blue
        int[] polygonX = {getCoords().x, getCoords().x-tailXSize, getCoords().x - tailXSize};
        int[] polygonY = {getCoords().y, getCoords().y+tailYSize/5, getCoords().y - tailYSize/5};

        int polygonN = 3;
        Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
    }

    @Override
    protected void drawEye(){
        Drawing.pen().setColor(Color.decode("#000000")); // HEX representation for Aqua blue
        Drawing.pen().fillOval((int)(getCoords().x+50+Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/6), (int)(getCoords().y-Constants.FISH_NORMAL_DIAMETER_X *getFishSize()/3.9), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()/4), (int)(Constants.FISH_NORMAL_DIAMETER_X * getFishSize()/4));
    }

	@Override
	protected void drawMouth() {
		// no mouth
	}

    @Override
    public Point address() {
        Point myPoint = new Point(getCoords().x,getCoords().y);
        return myPoint;
    }

    @Override
    public int width() {
        return (int) (Constants.FISH_NORMAL_DIAMETER_X *getFishSize()*2) + ((int)(Constants.FISH_NORMAL_DIAMETER_X *this.getFishSize()*Constants.FISH_TAIL_X_SIZE) - (int)(Constants.FISH_NORMAL_DIAMETER_X *this.getFishSize()/2));
    }

    @Override
    public int height() {
        return (int) (Constants.FISH_NORMAL_DIAMETER_Y *getFishSize());
    }
}
