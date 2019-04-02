package com.devdarkco.engine.components;

import com.badlogic.gdx.math.Vector2;

public class Transform extends   Component{

    private Vector2 position, scale;
    public float x, y;

    public Transform(float x, float y, float w, float h){
        super();
        this.position = new Vector2(x, y);
        this.scale = new Vector2(w, h);
        this.x = position.x;
        this.y = position.y;
    }

    public Vector2 getPos(){
        return this.position;
    }
}
