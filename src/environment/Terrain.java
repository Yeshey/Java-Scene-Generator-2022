package environment;

public class Terrain {
    private int coordsX;
    private int coordsY;
    private String colorHex;

    public Terrain(int coordsX, int coordsY, String colorHex) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;
    }

    public void draw() {}
}
