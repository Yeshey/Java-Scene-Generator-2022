package animal;

public class Shark extends Fish {
    private int coordsX;
    private int coordsY;
    private String colorHex;

    public Shark(int coordsX, int coordsY, String colorHex) {
        this.coordsX = coordsX;
        this.coordsY = coordsY;
        this.colorHex = colorHex;
    }

    public void draw(){}
}