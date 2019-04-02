package com.devdarkco.sandbox.gameObjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devdarkco.engine.components.SpriteRenderer;
import com.devdarkco.engine.components.Transform;
import com.devdarkco.engine.objects.GameObject;

public class Player extends GameObject {

    private Transform transform;
    private SpriteRenderer renderer;
    public float x, y;

    public Player(float x, float y) {
        super();
        transform = new Transform(x, y, 1, 1);
        renderer = new SpriteRenderer("badlogic.jpg", transform.x, transform.y);
        addComponent(transform);
        addComponent(renderer);
        this.x = transform.x;
        this.y = transform.y;
    }

    @Override
    public void render(SpriteBatch batch){
        super.render(batch);
    }

    @Override
    public void update(float delta){
        super.update(delta);
        this.x += 10;
    }
}
