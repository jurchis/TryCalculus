package com.milnesium;

public class Human extends Creature{

    private boolean feelings;
    private int feelingsLevel;
    private static final double massCoefficient = 1;

    public int increaseFeelings(int feelingsLevel, int increase){
        int feelingsSum;
        feelingsSum=feelingsLevel+increase;
        System.out.println("New feelings level: "+ feelingsSum);
        return feelingsSum;
    }

    public int decreaseFeelings(int feelingsLevel, int decrease){
        int feelingsDif;
        feelingsDif = feelingsLevel - decrease;
        System.out.println("New feelings level: " + feelingsDif);
        return feelingsDif;
    }

    public boolean isFeelings() {
        return feelings;
    }

    public void setFeelings(boolean feelings) {
        this.feelings = feelings;
    }

    public int getFeelingsLevel() {
        return feelingsLevel;
    }

    public void setFeelingsLevel(int feelingsLevel) {
        this.feelingsLevel = feelingsLevel;
    }

    public static double getMassCoefficient() {
        return massCoefficient;
    }
}