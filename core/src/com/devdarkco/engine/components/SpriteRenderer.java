package com.devdarkco.engine.components;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class SpriteRenderer extends Component {

    public Sprite sprite;

    /** Component that contains a sprite with the given texture;
     * @param texturePath - path to texture
     */
    public SpriteRenderer(String texturePath){
        sprite = new Sprite(new Texture(texturePath));
    }
}
