package com.devdarkco.engine.components;

import com.badlogic.gdx.math.Vector2;

public class Transform extends Component {

    // Blank Vector2 that holds the position of the object
    public Vector2 position = new Vector2();

    //Reference to the x value in the position Vector
    public float x = position.x;

    //Reference to the y value in the position Vector
    public float y = position.y;
}
