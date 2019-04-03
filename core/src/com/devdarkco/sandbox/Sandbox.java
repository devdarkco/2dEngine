package com.devdarkco.sandbox;

import com.badlogic.gdx.Game;
import com.devdarkco.engine.Engine;
import com.devdarkco.sandbox.screen.TestScreen;

public class Sandbox extends Game {

    @Override
    public void create() {
        Engine.init();
        setScreen(new TestScreen(this));

    }

    @Override
    public void render() {
        super.render();
        Engine.update();
    }
}
