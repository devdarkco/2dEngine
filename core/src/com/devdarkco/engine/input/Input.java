package com.devdarkco.engine.input;

import com.badlogic.gdx.Gdx;

public class Input {

    //Direction values in yUp
    private static final float LEFT  = -1;
    private static final float RIGHT = 1;
    private static final float UP = 1;
    private static final float DOWN = -1;

    /** Static class that hold the key codes for directional input */
    static public class KEY {
        public static final int A = 29;
        public static final int LEFT = 21;
        public static final int D = 32;
        public static final int RIGHT = 22;
        public static final int W = 51;
        public static final int UP = 19;
        public static final int S = 47;
        public static final int DOWN = 20;
    }

    /** Checks if the key is been pressed and release after a short time;
     * @param key - key code of the current key that is pressed
     * @return true or false depending if is been just pressed or is being pressed
     */
    public static boolean press(int key){
        return Gdx.input.isKeyJustPressed(key);
    }

    /** Checks if the key is being pressed
     * @param key - key code of the current key that is pressed
     * @return true or false depending if is been just pressed or is being pressed
     */
    public static boolean continuousPress(int key){
        return Gdx.input.isKeyPressed(key);
    }

    /** @return a value between 1 and -1 if tone of the current directional keys is being pressed or continuing pressed;
     */
    public static float getHorizontalInput(){
        if(press(KEY.A) || press(KEY.LEFT) || continuousPress(KEY.A) || continuousPress(KEY.LEFT))
            return LEFT;
        if(press(KEY.D) || press(KEY.RIGHT) || continuousPress(KEY.D) || continuousPress(KEY.RIGHT))
            return RIGHT;
        return 0;
    }

    /** @return a value between 1 and -1 if tone of the current directional keys is being pressed or continuing pressed;
     */
    public static float getVerticalInput(){
        if(press(KEY.W) || press(KEY.UP) || continuousPress(KEY.W) || continuousPress(KEY.UP))
            return UP;
        if(press(KEY.S) || press(KEY.DOWN) || continuousPress(KEY.S) || continuousPress(KEY.DOWN))
            return DOWN;
        return 0;
    }
}
