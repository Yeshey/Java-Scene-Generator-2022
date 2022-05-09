package environment;

public class Plant {
    private int coordsX;
    private int coordsY;
    private String colorHex;

    public Plant(int coordsX, int coordsY, String colorHex) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;
    }

    public void draw() {}
}
