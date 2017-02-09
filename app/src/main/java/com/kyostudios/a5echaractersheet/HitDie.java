package com.kyostudios.a5echaractersheet;

/**
 * Created by Kyoma on 2/8/2017.
 */

public class HitDie {

    public HitDie(Dice dieType, int totals){
        setDieType(dieType);
        setTotals(totals);
    }

    private Dice dieType;
    private int totals;

    public void setDieType(Dice dice){
        this.dieType = dice;
    }

    public void setTotals(int totals){
        this.totals = totals;
    }

    public Dice getDieType(){
        return this.dieType;
    }

    public int getTotals(){
        return this.totals;
    }
}
