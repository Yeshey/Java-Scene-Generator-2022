package graphicstate;

import gui.Scene;

import javax.xml.crypto.Data;

public class NightState extends State{
    private static NightState instance;

    public NightState(Scene ocean){
        super(ocean);
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new NightState(context);
        }
        return instance;
    }

    @Override
    public State day() {
        System.out.println("Night -> Day");
        context.setDay();
        return DayState.getInstance(context);
    }

    @Override
    public State night() {
        System.out.println("Already night... zzz...");
        return this;
    }

    @Override
    public State evening() {
        System.out.println("Night can't go backwards to evening silly");
        return this;
    }

    @Override
    public State sharkAttack() {
        System.out.println("Shark attacks can't happen at night");
        return this;
    }
}
