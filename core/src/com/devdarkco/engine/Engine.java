package com.devdarkco.engine;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

public class Engine {

    private static World world;
    private static OrthographicCamera camera;

    public static void init(){
        world = new World(new Vector2(0, -9.8f), false);
        camera = new OrthographicCamera();
        camera.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
    }

    public static void update(){
        world.step(1/60f, 6, 2);
    }

    public static World getWorld() {
        return world;
    }

    public static OrthographicCamera getCamera() {
        return camera;
    }
}
