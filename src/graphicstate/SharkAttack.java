package graphicstate;

import gui.Scene;

public class SharkAttack extends State {

    public SharkAttack(Scene ocean){
        super(ocean);
    }

    public static State getInstance(Scene ocean) {
        if (State.sharkAttack == null) {
            State.sharkAttack = new SharkAttack(ocean);
        }
        return State.sharkAttack;
    }

    @Override
    public State day() {
        System.out.println("SharkAttack -> Day");
        context.setDay();
        return DayState.getInstance(context);
    }

    @Override
    public State night() {
        System.out.println("SharkAttack -> Night");
        context.setNight();
        return NightState.getInstance(context);
    }

    @Override
    public State evening() {
        System.out.println("SharkAttack -> Evening");
        context.setEvening();
        return EveningState.getInstance(context);
    }

    @Override
    public State sharkAttack() {
        System.out.println("You want even more blood?!");
        return this;
    }
}
