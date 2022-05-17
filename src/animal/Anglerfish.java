package animal;

import gui.Drawing;
import java.awt.*;

// public class lanternFish extends Fish{
public class Anglerfish extends Fish { // extends Fish

	public Anglerfish(Point coords, String colorHex, int size) {
        super(coords, colorHex, size);
	}

	public void draw() {
		Drawing.pen().drawLine(100, 100, 800, 800);
		Drawing.pen().fillOval(getCoordsX(), getCoordsY(), 60, 50);
	}
}
