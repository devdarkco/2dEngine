package com.devdarkco.sandbox;

import com.badlogic.gdx.Game;
import com.devdarkco.sandbox.screen.TestScreen;

public class Sandbox extends Game {

    @Override
    public void create() {
        setScreen(new TestScreen(this));
    }
}
