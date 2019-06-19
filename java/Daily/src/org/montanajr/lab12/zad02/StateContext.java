package org.montanajr.lab12.zad02;

import org.montanajr.lab12.state.StanDzwonka;
import org.montanajr.lab12.state.Wibracje;

public class StateContext {
    public void play() {
        level.play(this);
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    private Level level;

    public StateContext()
    {
        level = new FirstLevel();
    }

    public void lost() {
        level.lost();
    }
}
