package com.devdarkco.engine.input;

import com.badlogic.gdx.Gdx;

public class SwipeDetector {

    public static boolean swipeLeft(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaX() < 0;
    }

    public static boolean swipeRight(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaX() > 0;
    }

    public static boolean swipeUp(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaY() > 0;
    }

    public static boolean swipeDown(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaY() < 0;
    }
}
