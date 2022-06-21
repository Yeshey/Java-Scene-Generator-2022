package graphicstate;

public class SharkAttack extends State {
    private static SharkAttack instance = new SharkAttack();

    public static State getInstance() {
        if (instance == null) {
            instance = new SharkAttack();
        }
        return instance;
    }

    @Override
    public State day() {
        System.out.println("SharkAttack -> Day");
        return DayState.getInstance();
    }

    @Override
    public State night() {
        System.out.println("SharkAttack -> Night");
        return NightState.getInstance();
    }

    @Override
    public State evening() {
        System.out.println("SharkAttack -> Evening");
        return EveningState.getInstance();
    }

    @Override
    public State sharkAttack() {
        System.out.println("You want even more blood?!");
        return this;
    }
}
