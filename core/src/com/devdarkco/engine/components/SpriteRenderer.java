package com.devdarkco.engine.components;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class SpriteRenderer extends Component {

    private Texture texture;
    private Sprite sprite;
    private Vector2 spritePos;

    private String texturePath;

    public SpriteRenderer(String texturePath, float x, float y) {
        super();
        this.texturePath = texturePath;
        this.texture = new Texture(texturePath);
        this.sprite = new Sprite(texture);
        this.spritePos = new Vector2(x, y);
    }

    public void render(SpriteBatch batch, float x, float y) {
        batch.draw(this.texture, x, y);
    }

    public String getTexturePath(){
        return texturePath;
    }

    public Vector2 getSpritePos() {
        return spritePos;
    }
}
