package animal;

import gui.Drawing;
import java.awt.*;

public class Anglerfish extends Fish {

	public Anglerfish(Point coords, String colorHex, int size) {
        super(coords, colorHex, size);
	}

	public void draw() {
		Drawing.pen().drawLine(100, 100, 800, 800);
		Drawing.pen().fillOval(getCoords().x, getCoords().y, 60, 50);
	}

	@Override
	protected void drawTail() {
		// TODO Auto-generated method stub
		
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

}
