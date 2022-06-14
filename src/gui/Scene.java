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
    private JFrame jFrame = new JFrame();

    public Scene() {
        //guiButton = new Button();
        terrain = new Terrain(jFrame.getToolkit().getScreenSize().getWidth(), jFrame.getToolkit().getScreenSize().getHeight());
        newFishToArray();
    }

    public Point generateCoordinates() {
        int coordsX = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getWidth());
        int coordsY = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getHeight()-(Constants.TERRAIN_MAX_HEIGH+50));
        Point point = new Point(coordsX, coordsY);

        return point;
    }

    public void onlyGuppy() {

    }

    public void onlyWhale() {

        for (Fish fish : fishArrayList) {

        }
    }

    public void setRandomColor() {
        String[] colors = {"#5D3FD3", "#00A36C", "#088F8F"};
        //System.out.println(fishArrayList.get(1).getFishHex());

        for (Fish fish : fishArrayList) {
            fish.setColorHex(colors[(int) RandDouble.between(0, 2)]);
        }

        //System.out.println(fishArrayList.get(1).getFishHex());
    }


    public void newFishToArray() {
        if (!fishArrayList.isEmpty()) {
            for (int i = 0; i < fishArrayList.size(); i++) {
                fishArrayList.remove(i);
            }
        }

        for (int i = 0; i < 15; i += 2) {

            // rand double can be between 0.8 and 1.5
            double size = RandDouble.between(Constants.FISH_RAND_SIZE_RANGE_LOW, Constants.FISH_RAND_SIZE_RANGE_HIGH);

            Guppy newGuppy = new Guppy(generateCoordinates(), "#ff0000", size);
            Whale newWhale = new Whale(generateCoordinates(), "#2F387B", size);

            if (vacantProperty(newWhale)) {
                fishArrayList.add(newWhale);
            } else {
                System.out.println("Whale overlap");

                i -= 1;
            }

            if (vacantProperty(newGuppy)) {
                fishArrayList.add(newGuppy);
            } else {
                System.out.println("Fish overlap");
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
        terrain.draw();
    }
}
