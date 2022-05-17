package gui;

import java.awt.*;
import java.util.ArrayList;

import animal.Anglerfish;
import animal.Fish;
import environment.Terrain;

import javax.swing.*;

//import drawingTool.Drawing;

public class Scene {

    private ArrayList<Fish> fishArrayList = new ArrayList<>(); //fishes
    private Terrain terrain; // composite
    private Button guiButton; //composite

    public Scene() {
        //guiButton = new Button();
        tenRedFishToArray("Joao");
    }

    public void tenRedFishToArray(String name) {
        for (int i = 0; i < 10; i++) {
            int coordsX = RandNum.between(10, 800);
            int coordsY = RandNum.between(10, 800);

            int size = RandNum.between(1, 3);

            Fish newRedFish = new Fish(name, coordsX, coordsY, "#ff0000", size);
            //if (newRedFish.intersects())
            fishArrayList.add(newRedFish);
        }
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
