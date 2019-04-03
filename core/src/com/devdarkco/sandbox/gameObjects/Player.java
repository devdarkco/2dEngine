package com.devdarkco.sandbox.gameObjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.devdarkco.engine.Engine;
import com.devdarkco.engine.components.RigidBody;
import com.devdarkco.engine.components.SpriteRenderer;
import com.devdarkco.engine.components.Transform;
import com.devdarkco.engine.objects.GameObject;

public class Player extends GameObject {

    public float x, y;

    public Body playerBody;

    public Player(float x, float y) {
        super();
        this.x = x;
        this.y = y;
        addComponents();

        playerBody = getComponent(RigidBody.class).createBody(BodyDef.BodyType.DynamicBody, x, y, true);
    }

    private void addComponents(){
        addComponent(new Transform());
        addComponent(new SpriteRenderer("badlogic.jpg"));
        addComponent(new RigidBody());
    }

    @Override
    public void render(SpriteBatch batch){
        super.render(batch);
        batch.draw(getComponent(SpriteRenderer.class).getSprite(), this.x, this.y);
        getComponent(RigidBody.class).debugRenderer.render(Engine.getWorld(), Engine.getCamera().combined);
    }

    @Override
    public void update(float delta){
        super.update(delta);
    }
}
