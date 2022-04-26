package animal;

import animal.Fish;
import drawingTool.Drawing;

// public class lanternFish extends Fish{
public class Anglerfish /*extends Fish*/ { // extends Fish
	private int coordsX;
	private int coordsY;
	private String colorHex;

	public Anglerfish(int coordsX, int coordsY) {
		this.coordsX = coordsX;
		this.coordsY = coordsY;
	}
	
	public void draw() {
		Drawing.pen().drawLine(100, 100, 800, 800);
		Drawing.pen().fillOval(coordsX, coordsY, 60, 50);
	}
}
