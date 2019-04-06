package com.devdarkco.engine.input;

import com.badlogic.gdx.Gdx;

public class Input {

    private static final float LEFT  = -1, RIGHT = 1, UP = 1, DOWN = -1;

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

    public static boolean press(int key){
        return Gdx.input.isKeyJustPressed(key);
    }

    public static boolean continuousPress(int key){
        return Gdx.input.isKeyPressed(key);
    }

    public static float getHorizontalInput(){
        if(press(KEY.A) || press(KEY.LEFT) || continuousPress(KEY.A) || continuousPress(KEY.LEFT))
            return LEFT;
        if(press(KEY.D) || press(KEY.RIGHT) || continuousPress(KEY.D) || continuousPress(KEY.RIGHT))
            return RIGHT;
        return 0;
    }

    public static float getVerticalInput(){
        if(press(KEY.W) || press(KEY.UP) || continuousPress(KEY.W) || continuousPress(KEY.UP))
            return UP;
        if(press(KEY.S) || press(KEY.DOWN) || continuousPress(KEY.S) || continuousPress(KEY.DOWN))
            return DOWN;
        return 0;
    }
}
