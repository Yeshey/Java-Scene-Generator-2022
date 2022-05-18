package gui;

import java.awt.*;
import java.util.ArrayList;

import animal.Fish;
import animal.Guppy;
import animal.Whale;
import environment.Terrain;
import utils.Constants;
import utils.RandDouble;

import javax.swing.*;

//import drawingTool.Drawing;

public class Scene extends JFrame {

    private ArrayList<Fish> fishArrayList = new ArrayList<>(); //fishes
    private Terrain terrain; // composite
    private Button guiButton; //composite
    private JFrame jFrame = new JFrame();

    public Scene() {
        //guiButton = new Button();
        newFishToArray();
    }

    public Point generateCoordinates() {
        int coordsX = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getWidth());
        int coordsY = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getHeight());
        Point point = new Point(coordsX, coordsY);

        return point;
    }

    public void newFishToArray() {
        for (int i = 0; i < 10; i+= 2) {

            // rand double can be between 0.8 and 1.5
            double size = RandDouble.between(Constants.FISH_RAND_SIZE_RANGE_LOW, Constants.FISH_RAND_SIZE_RANGE_HIGH);

            Guppy newGuppy = new Guppy(generateCoordinates(), "#ff0000", size);
            Whale newWhale = new Whale(generateCoordinates(), "#00FFFF", size);

            if (vacantProperty(newWhale)) {
                fishArrayList.add(newWhale);
            } else {
                i -= 1;
            }


            if (vacantProperty(newGuppy)) {
                fishArrayList.add(newGuppy);
            } else {
                i -= 1;
            }
        }
    }


    private boolean vacantProperty(Fish newF) {
        boolean anyIntersection = false;
        for (Fish h : fishArrayList) {
            anyIntersection = anyIntersection || h.intersects(newF);
        }
        return !anyIntersection;
    }


    public void drawFishes() {
        for (int i = 0; i < fishArrayList.size(); i++) {
            fishArrayList.get(i).draw();

        }
    }


    public void draw() {
        drawFishes();
    }
}
