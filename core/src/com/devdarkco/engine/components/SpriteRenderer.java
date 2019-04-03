package com.devdarkco.engine.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class SpriteRenderer extends Component {

    private String texturePath;
    private Texture texture;
    private Sprite sprite;
    public boolean render = false;

    public SpriteRenderer(String texturePath){
        texture = new Texture(texturePath);
        sprite = new Sprite(texture);
    }

    public Sprite getSprite() {
        return sprite;
    }
}
