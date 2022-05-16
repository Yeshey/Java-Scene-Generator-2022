package gui;

import java.awt.*;
import java.util.ArrayList;

import animal.Anglerfish;
import animal.Fish;
import environment.*;

import javax.swing.*;

//import drawingTool.Drawing;

public class Scene {

    private JPanel westPanel = new JPanel();
    private JButton b1 = new JButton("2");
    private ArrayList<Fish> fishArrayList = new ArrayList<>();

    private Fish fish; // aggregate
    private Coral coral; // aggregate
    private Plant plant; // aggregate
    private Terrain terrain; // aggregate
    private Button guiButton; //composite

    public Scene() {
        guiButton = new Button();
    }

    public static int between(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }


    public void tenRedFishToArray(String name) {
        for (int i = 0; i < 10; i++) {
            int coordsX = between(10, 800);
            int coordsY = between(10, 800);

            Fish newRedFish = new Fish(name, coordsX, coordsY, "#ff0000", 1);
            fishArrayList.add(newRedFish);
        }
    }

    public void drawFishes(){
        for (int i = 0; i < fishArrayList.size(); i++) {
            fishArrayList.get(i).draw();
        }
    }

    public void draw() {
        tenRedFishToArray("Joao");
        drawFishes();

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

    }
}
