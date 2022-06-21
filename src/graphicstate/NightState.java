package graphicstate;

public class NightState extends State{
    private static NightState instance = new NightState();

    public static State getInstance() {
        if (instance == null) {
            instance = new NightState();
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
