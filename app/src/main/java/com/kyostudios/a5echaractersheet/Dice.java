package com.kyostudios.a5echaractersheet;

/**
 * Created by Kyoma on 2/8/2017.
 */

public class Dice {
    public Dice(int max, int repeat){
        setMaxSide(max);
        setRepeat(repeat);
    }

    private int maxSide;
    private int repeat;

    public void setMaxSide(int maxSide){
        this.maxSide = maxSide;
    }

    public void setRepeat(int repeat){
        this.repeat = repeat;
    }

    public int getMaxSide(){
        return this.maxSide;
    }

    public int getRepeat(){
        return this.repeat;
    }

    public String getDiceType(){
        String name = getRepeat() + "+" + getMaxSide();
        return name;
    }
}
