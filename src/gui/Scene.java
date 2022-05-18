package gui;

import java.awt.*;
import java.util.ArrayList;

import animal.Fish;
import animal.Guppy;
import animal.Whale;
import environment.Terrain;
import utils.Constants;
import utils.RandDouble;

//import drawingTool.Drawing;

public class Scene {

    private ArrayList<Fish> fishArrayList = new ArrayList<>(); //fishes
    private Terrain terrain; // composite
    private Button guiButton; //composite

    public Scene() {
        //guiButton = new Button();
        tenRedFishToArray();
    }

    public void tenRedFishToArray() {
        for (int i = 0; i < 10; i++) {
            int coordsX = (int) RandDouble.between(10, 800);
            int coordsY = (int) RandDouble.between(10, 800);

            double size = RandDouble.between(Constants.FISH_RAND_SIZE_RANGE_LOW, Constants.FISH_RAND_SIZE_RANGE_HIGH);

            Guppy newRedFish = new Guppy(new Point(coordsX, coordsY), "#ff0000", size);
            Whale newWhale = new Whale(new Point(100, 100), "#00FFFF", size);
            // TODO test whether it intersects with any other before adding a new Fish
            if ( vacantProperty(newRedFish) ){
                fishArrayList.add(newRedFish);
            } else {
                i-=1;
            }
            fishArrayList.add(newWhale);
        }
    }



    private boolean vacantProperty(Fish newF) {
        boolean anyIntersection = false;
        for (Fish h : fishArrayList){
            anyIntersection = anyIntersection || h.intersects (newF);
        }
        return ! anyIntersection ;
    }



    public void drawFishes() {
        for (int i = 0; i < fishArrayList.size(); i++) {
            fishArrayList.get(i).draw();

        }
    }


    public void draw() {
        drawFishes();

        /* --------------- random shapes --------------- */ /*
        String color = "#ffff00";

        Drawing.pen().setColor(Color.decode(color)); // a color constant
        Drawing.pen().fillRect(10, 10, 200, 300);

        Drawing.pen().setColor(Color.decode("#7a5230")); // HEX representation
        Drawing.pen().fillOval(300, 234, 800, 100);

        Drawing.pen().setColor(new Color(255, 100, 100)); // RGB representation
        Drawing.pen().drawString("Hello World", 666, 280);

        // Draw the triangle
        int[] polygonX = {10, 60, 30};
        int[] polygonY = {10, 10, 60};
        int polygonN = 3;
        Drawing.pen().drawPolygon(polygonX, polygonY, polygonN);
        Drawing.pen().drawLine(100, 200, 800, 800);

        Fish funny = new Fish(400, 260);
        funny.draw();

        ArrayList<Anglerfish> fishGroup = new ArrayList<Anglerfish>();
        for (int i = 0; i < 5; i++) {
            fishGroup.add(new Anglerfish(300 + 100 * i, 260));
        }
        //lanternFish myLanternFish = new lanternFish(300, 260);
        for (Anglerfish f : fishGroup) {
            f.draw();
        }
     */ /* --------------- random shapes --------------- */

    }
}
