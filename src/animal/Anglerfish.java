package animal;

import gui.Drawing;

// public class lanternFish extends Fish{
public class Anglerfish /*extends Fish*/ { // extends Fish
	private int coordsX;
	private int coordsY;
	private String colorHex;

	public Anglerfish(int coordsX, int coordsY) {
		this.coordsX = coordsX;
		this.coordsY = coordsY;
	}

	public Anglerfish(int coordsX, int coordsY, String colorHex) {
		this.coordsX = coordsX;
		this.coordsY = coordsY;
		this.colorHex = colorHex;
	}

	public void draw() {
		Drawing.pen().drawLine(100, 100, 800, 800);
		Drawing.pen().fillOval(coordsX, coordsY, 60, 50);
	}
}
