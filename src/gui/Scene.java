package gui;

import java.awt.*;
import java.util.ArrayList;

import animal.Fish;
import animal.Guppy;
import animal.Whale;
import environment.Terrain;
import graphicstate.DayState;
import graphicstate.State;
import utils.Constants;
import utils.RandDouble;
import utils.RandInt;
import gui.Drawing;

import javax.swing.*;

public class Scene extends JFrame {

    private ArrayList<Fish> fishArrayList = new ArrayList<>(); //fishes
    private Terrain terrain; // composite
    private JFrame jFrame = new JFrame();
    //TODO Ask Gottfreid why this attribute should be static (according to the task sheet)
    private State currentState;
    private String backgroundColour;
    private DrawingArea da;


    public Scene(DrawingArea da) {
        this.da = da;
        backgroundColour = "#0096FF";
        State.setContext(this);
        currentState = DayState.getInstance();
        terrain = new Terrain(jFrame.getToolkit().getScreenSize().getWidth(), jFrame.getToolkit().getScreenSize().getHeight(),(int)RandDouble.between(0,1000));
        newFishToArray();
    }

    public Point generateCoordinates() {
        int coordsX = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getWidth());
        int coordsY = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getHeight()-(Constants.TERRAIN_MAX_HEIGH+50));
        Point point = new Point(coordsX, coordsY);

        return point;
    }

    public Point generateSleepingCoordinates() {
        int coordsX = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getWidth());
        int coordsY = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getHeight()-(Constants.TERRAIN_MAX_HEIGH+50));
        Point point = new Point(coordsX, coordsY);

        return point;
    }

    public void setRandomColor() {
        String[] colors = {"#5D3DF3", "#00A36C", "#088F8F"};

        for (Fish fish : fishArrayList) {
            fish.setColorHex(colors[RandInt.between(0, 2)]);
        }
    }


    public void newFishToArray() {
        //TODO Check if necessary
        if (!fishArrayList.isEmpty()) {
            for (int i = 0; i < fishArrayList.size(); i++) {
                fishArrayList.remove(i);
            }
        }

        for (int i = 0; i < 15; i += 2) {
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

    public void sleepingFishesToArray() {
        //TODO Check if necessary
        if (!fishArrayList.isEmpty()) {
            for (int i = 0; i < fishArrayList.size(); i++) {
                fishArrayList.remove(i);
            }
        }

        for (int i = 0; i < 15; i += 2) {
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

    public void setNight() {
        backgroundColour = "#1c3b82";
    }

    public void setDay() {
        backgroundColour = "#0096FF";
    }

    public void setEvening() {

    }

    public void setSharkAttack() {

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
        da.setSceneBackground(backgroundColour);
        drawFishes();
        terrain.draw();
    }

    public void resetTerrain(){
        terrain.newSeed();
    }

    public void day(){
        currentState = currentState.day();
    }

    public void evening(){
        currentState = currentState.evening();
    }

    public void night(){
        currentState = currentState.night();
    }

    public void sharkAttack(){
        currentState = currentState.sharkAttack();
    }
}
