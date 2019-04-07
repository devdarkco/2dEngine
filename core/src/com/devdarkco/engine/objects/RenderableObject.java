package com.devdarkco.engine.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.devdarkco.engine.components.SpriteRenderer;

public class RenderableObject extends GameObject {

    public SpriteRenderer spriteRenderer;

    /** Inheritance of the GameObject class that contains all the main components system;
     * RenderableObject is a class that contains already the SpriteRenderer component;
     * @param texturePath -  path location to the texture in use.
     */
    public RenderableObject(String texturePath){
        addComponent(new SpriteRenderer(texturePath));
        spriteRenderer = getComponent(SpriteRenderer.class);
    }

    @Override
    public void render(SpriteBatch batch) {
        super.render(batch);
        batch.draw(spriteRenderer.getSprite(), transform.position.x, transform.position.y);
    }
}
