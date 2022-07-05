package graphicstate;

import gui.Scene;

public class NightState extends State{

    public NightState(Scene ocean){
        super(ocean);
    }

    public static State getInstance(Scene ocean) {
        if (State.nightState == null) {
            State.nightState = new NightState(ocean);
        }
        return State.nightState;
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
