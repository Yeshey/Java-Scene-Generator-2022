package drawingTool;

public class lanternFish {
	private int coordsX;
	private int coordsY;
	
	public lanternFish(int coordsX,int coordsY) {
		this.coordsX = coordsX;
		this.coordsY = coordsY;
	}
	
	public void draw() {
		//Drawing.pen().drawLine(100, 100, 800, 800);
		Drawing.pen().fillOval(coordsX, coordsY, 60, 50);
	}
}
