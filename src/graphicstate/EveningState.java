package graphicstate;

import org.w3c.dom.events.EventException;

public class EveningState extends State{
    private static EveningState instance = new EveningState();

    public static State getInstance() {
        if (instance == null) {
            instance = new EveningState();
        }
        return instance;
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
        return NightState.getInstance();
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
        return SharkAttack.getInstance();
    }
}
