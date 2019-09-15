package com.milnesium;

public class Alien extends Creature{

    private boolean artificialFeelings;
    private int artificialFeelingsLevel;
    private static final double massCoefficient = 1.7;

    @Override
    public int doSum(int currentAge, int years) {

        int alienYears;
        alienYears = years / 2;
        int alienSum = currentAge + alienYears;
        System.out.println(getName() + " has " + currentAge + " years and will have " + alienSum + " years in " +
                years + " human years!");
        return alienSum;
    }

    public int getArtificialFeelingsLevel() {
        return artificialFeelingsLevel;
    }

    public void setArtificialFeelingsLevel(int artificialFeelingsLevel) {
        this.artificialFeelingsLevel = artificialFeelingsLevel;
    }

    public boolean isArtificialFeelings() {
        return artificialFeelings;
    }

    public void setArtificialFeelings(boolean artificialFeelings) {
        this.artificialFeelings = artificialFeelings;
    }

    public static double getMassCoefficient() {
        return massCoefficient;
    }
}
