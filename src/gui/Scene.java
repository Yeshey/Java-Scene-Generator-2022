package gui;

import java.awt.*;
import java.util.ArrayList;

import animal.Fish;
import animal.Guppy;
import animal.Shark;
import animal.Whale;
import environment.Terrain;
import graphicstate.DayState;
import graphicstate.State;
import utils.Constants;
import utils.RandDouble;
import java.util.Random;
import javax.swing.*;

public class Scene extends JFrame {

    private ArrayList<Fish> fishArrayList = new ArrayList<>(); //fishes
    private Terrain terrain; // composite
    private JFrame jFrame = new JFrame();
    private State currentState;
    private String backgroundColour;
    private DrawingArea da;


    public Scene(DrawingArea da) {
        this.da = da;
        backgroundColour = "#0096FF";
        State.resetState();
        currentState = DayState.getInstance(this);
        terrain = new Terrain(jFrame.getToolkit().getScreenSize().getWidth(), jFrame.getToolkit().getScreenSize().getHeight(),(int)RandDouble.between(0,1000));
        newFishToArray();
    }

    public Point generateCoordinates() {
        int coordsX = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getWidth());
        int coordsY = (int) RandDouble.between(0, jFrame.getToolkit().getScreenSize().getHeight()-(Constants.TERRAIN_MAX_HEIGH+50));
        Point point = new Point(coordsX, coordsY);

        return point;
    }

    private String getRandomHexString(int numchars){
        Random r = new Random();
        StringBuffer sb = new StringBuffer();
        while(sb.length() < numchars){
            sb.append(Integer.toHexString(r.nextInt()));
        }

        return sb.toString().substring(0, numchars);
    }

    public void setRandomColor() {
        for (Fish fish : fishArrayList) {
            fish.setColorHex('#' + getRandomHexString(6));
        }
    }


    public void newFishToArray() {
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
        backgroundColour = "#356eb8";
    }

    public void setSharkAttack() {
        backgroundColour = "#e00443";
        fishArrayList.clear();
        Point point = new Point(500, 300);
        Shark shark = new Shark(point, "#9212b3", 4);
        fishArrayList.add(shark);
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
