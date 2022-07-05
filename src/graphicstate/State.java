package graphicstate;
import gui.Scene;

public abstract class State {
    protected static DayState dayState;
    protected static EveningState eveningState;
    protected static NightState nightState;
    protected static SharkAttack sharkAttack;
    protected Scene context;

    public State(Scene ocean) {
        context = ocean;
    }

    public static void resetState() {
        dayState = null;
        eveningState = null;
        nightState = null;
        sharkAttack = null;
    }

    public abstract State day();
    public abstract State night();
    public abstract State evening();
    public abstract State sharkAttack();

    //public static void setContext(Scene ocean){
    //    context = ocean;
    //}
}