package animal;

import gui.Drawing;

// public class lanternFish extends Fish{
public class Anglerfish extends Fish { // extends Fish

	public Anglerfish(int coordsX, int coordsY, String colorHex, int size) {
        super(coordsX, coordsY, colorHex, size);
	}

	public void draw() {
		Drawing.pen().drawLine(100, 100, 800, 800);
		Drawing.pen().fillOval(getCoordsX(), getCoordsY(), 60, 50);
	}
}
