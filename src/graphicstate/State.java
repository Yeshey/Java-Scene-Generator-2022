package graphicstate;
import gui.Scene;

public abstract class State {

    //TODO ask if we need this stuff
    protected Scene context;

    public abstract State day();
    public abstract State night();
    public abstract State evening();
    public abstract State sharkAttack();
}