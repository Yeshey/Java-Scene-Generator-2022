package environment;

import gui.Drawing;
import utils.Constants;
import utils.RandDouble;

import javax.swing.JFrame;
import java.awt.Color;

public class Terrain extends JFrame {
    private String colorHex;
    private double screen_x;
    private double screen_y;

    public Terrain(double screen_x, double screen_y) {
        this.colorHex = "#964B00";
        this.screen_x = screen_x;
        this.screen_y = screen_y;
    }

    public void draw() {
        Drawing.pen().setColor(Color.decode(this.colorHex)); // HEX representation

        int numOfIters = 100;

        for (int i=0; i<screen_x; i+=screen_x/numOfIters){
            int[] polygonX = {i,
                (int)(i+RandDouble.between(-200, -50)), 
                (int)(i+RandDouble.between(50, 200))};
            int[] polygonY = {(int)screen_y+1000, 
                (int)(screen_y+RandDouble.between(-Constants.TERRAIN_MAX_HEIGH, 0)), 
                (int)(screen_y+RandDouble.between(-Constants.TERRAIN_MAX_HEIGH, 0))};
            int polygonN = 3;
    
            Drawing.pen().fillPolygon(polygonX, polygonY, polygonN);
        }

    }
}
