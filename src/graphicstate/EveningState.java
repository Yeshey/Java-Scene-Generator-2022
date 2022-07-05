package graphicstate;

import org.w3c.dom.events.EventException;
import gui.Scene;

public class EveningState extends State{

    public EveningState(Scene ocean){
        super(ocean);
    }

    public static State getInstance(Scene ocean) {
        if (State.eveningState == null) {
            State.eveningState = new EveningState(ocean);
        }
        return State.eveningState;
    }

    @Override
    public State day() {
        System.out.println("Evening can't go backwards to day silly");
        return this;
    }

    @Override
    public State night() {

        System.out.println("Evening -> Night");
        context.setNight();
        return NightState.getInstance(context);
    }

    @Override
    public State evening() {
        System.out.println("Already evening...");
        return this;
    }

    @Override
    public State sharkAttack() {
        System.out.println("Evening -> Shark attack");
        context.setSharkAttack();
        return SharkAttack.getInstance(context);
    }
}
