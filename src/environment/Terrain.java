package environment;

import gui.Drawing;
import utils.Constants;
import utils.RandDouble;
import java.util.Random;

import javax.swing.JFrame;
import java.awt.Color;

public class Terrain extends JFrame {
    private String colorHex;
    private double screen_x;
    private double screen_y;
    private long seed;
    Random r;

    public Terrain(double screen_x, double screen_y, long seed) {
        this.colorHex = "#964B00";
        this.screen_x = screen_x;
        this.screen_y = screen_y;
        this.seed = seed;

        r = new Random();
    }

    public double between(double min, double max) {
        return min + (max - min) * r.nextDouble();
    }

    public void draw() {
        r.setSeed(seed);
        Drawing.pen().setColor(Color.decode(this.colorHex)); // HEX representation
        int numOfIters = 100;

        for (int i=0; i<screen_x; i+=screen_x/numOfIters){
            int[] polygonX = {i,
                (int)(i+between(-200, -50)), 
                (int)(i+between(50, 200))};
            int[] polygonY = {(int)screen_y+1000, 
                (int)(screen_y+between(-Constants.TERRAIN_MAX_HEIGH, 0)), 
                (int)(screen_y+between(-Constants.TERRAIN_MAX_HEIGH, 0))};
            int polygonN = 3;
    
            Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
        }

    }
}
