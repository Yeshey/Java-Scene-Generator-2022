package graphicstate;
import gui.Scene;

public abstract class State {

    protected static Scene context;

    public abstract State day();
    public abstract State night();
    public abstract State evening();
    public abstract State sharkAttack();

    //public static void setContext(Scene ocean){
    //    context = ocean;
    //}
}