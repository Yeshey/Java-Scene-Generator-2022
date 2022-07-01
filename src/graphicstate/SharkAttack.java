package graphicstate;

import gui.Scene;

public class SharkAttack extends State {
    private static SharkAttack instance;

    public SharkAttack(Scene ocean){
        this.context=ocean;
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new SharkAttack(context);
        }
        return instance;
    }

    @Override
    public State day() {
        System.out.println("SharkAttack -> Day");
        context.setDay();
        return DayState.getInstance();
    }

    @Override
    public State night() {
        System.out.println("SharkAttack -> Night");
        context.setNight();
        return NightState.getInstance();
    }

    @Override
    public State evening() {
        System.out.println("SharkAttack -> Evening");
        context.setEvening();
        return EveningState.getInstance();
    }

    @Override
    public State sharkAttack() {
        System.out.println("You want even more blood?!");
        return this;
    }
}
