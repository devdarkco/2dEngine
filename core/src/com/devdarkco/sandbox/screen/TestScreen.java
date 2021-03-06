package com.devdarkco.sandbox.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devdarkco.sandbox.Const;
import com.devdarkco.sandbox.Sandbox;
import com.devdarkco.sandbox.gameObjects.Player;

public class TestScreen extends ScreenAdapter {

    private Sandbox sandbox;

    private Player player;

    SpriteBatch batch;
    Texture img;

    public TestScreen(Sandbox sandbox){
        this.sandbox = sandbox;
        this.player = new Player(Const.WIDTH/2, Const.HEIGHT/2);
        batch = new SpriteBatch();
    }

    @Override
    public void show() {
        super.show();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        player.render(batch);
        player.update(delta);
        batch.end();
    }

    @Override
    public void hide() {
        super.hide();
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
        img.dispose();
    }
}
