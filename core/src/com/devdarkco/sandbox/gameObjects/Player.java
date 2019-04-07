package com.devdarkco.sandbox.gameObjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devdarkco.engine.input.Input;
import com.devdarkco.engine.objects.RenderableObject;

public class Player extends RenderableObject {


    public Player(float x, float y) {
        super("badlogic.jpg");
    }

    @Override
    public void render(SpriteBatch batch) {
        super.render(batch);
    }

    @Override
    public void update(float delta) {
        super.update(delta);
        float xAxis = Input.getHorizontalInput();
        float yAxis = Input.getVerticalInput();
        if (xAxis < 0) {
            transform.position.x -= 10;
        } else if (xAxis > 0) {
            transform.position.x += 10;
        }
        if (yAxis < 0) {
            transform.position.y -= 10;
        } else if (yAxis > 0) {
            transform.position.y += 10;
        }
    }
}
