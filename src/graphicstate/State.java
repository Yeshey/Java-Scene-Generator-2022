package graphicstate;
import gui.Scene;

public abstract class State {

    protected Scene context;

    public abstract State day();
    public abstract State night();
    public abstract State evening();
    public abstract State sharkAttack();
}