package graphicstate;

import gui.Scene;

public class DayState extends State {

    public DayState(Scene ocean){
        super(ocean);
    }

    public static State getInstance(Scene ocean) {

        if (State.dayState == null) {
            State.dayState = new DayState(ocean);
        }
        return State.dayState;
    }

    @Override
    public State day() {
        System.out.println("It is already day silly");
        return this;
    }

    @Override
    public State night() {

        System.out.println("The evening comes before the night silly");
        return this;
    }

    @Override
    public State evening() {
        System.out.println("day -> evening");
        context.setEvening();
        return EveningState.getInstance(context);
    }

    @Override
    public State sharkAttack() {
        System.out.println("day -> shark attack");
        context.setSharkAttack();
        return SharkAttack.getInstance(context);
    }
}
