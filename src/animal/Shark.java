package animal;

import java.awt.*;
import utils.Constants;

public class Shark extends Fish {

    public Shark(Point coords, String colorHex, int size) {
        super(coords, colorHex, size);
    }
    
    @Override
    protected void drawTail(){
    	
    }

	@Override
	protected void drawEye() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void drawMouth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void drawBody() {
		// TODO Auto-generated method stub
	
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