package graphicstate;

public class DayState extends State {
    private static DayState instance = new DayState();

    public static State getInstance() {
        if (instance == null) {
            instance = new DayState();
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
