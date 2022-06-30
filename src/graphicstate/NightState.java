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
        System.out.println("Night -> Day");
        context.setDay();
        return DayState.getInstance();
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
