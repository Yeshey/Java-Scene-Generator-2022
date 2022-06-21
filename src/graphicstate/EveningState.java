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
        return null;
    }

    @Override
    public State night() {
        return null;
    }

    @Override
    public State evening() {
        return null;
    }

    @Override
    public State sharkAttack() {
        return null;
    }
}
