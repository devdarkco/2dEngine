package com.devdarkco.engine.input;

import com.badlogic.gdx.Gdx;

public class SwipeDetector {

    /**
     * @return true if the user swipes from right to left;
     */
    public static boolean swipeLeft(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaX() < 0;
    }

    /**
     * @return true if the user swipes from left to right;
     */
    public static boolean swipeRight(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaX() > 0;
    }

    /**
     * @return true if the user swipes from bottom to top;
     */
    public static boolean swipeUp(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaY() > 0;
    }

    /**
     * @return true if the user swipes from top to bottom;
     */
    public static boolean swipeDown(){
        return Gdx.input.isTouched() && Gdx.input.getDeltaY() < 0;
    }
}
