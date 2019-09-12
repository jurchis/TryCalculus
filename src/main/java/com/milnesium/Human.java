package com.milnesium;

public class Human {

    private String name;
    private int currentAge;
    private int years;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int doSum(int currentAge, int years) {
        int sum;
        sum=currentAge+years;
        return sum;
    }

}