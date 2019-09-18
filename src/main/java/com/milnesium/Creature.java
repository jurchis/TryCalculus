package com.milnesium;

public class Creature {

    private String name;
    private int currentAge;
    private int years;
    private int mass;
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

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

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int doSum(int currentAge, int years) {
        int sum;
        sum = currentAge + years;
        System.out.println(getName() + " has " + currentAge + " years and will have " + sum + " years in " +
                years + " years!");
        return sum;
    }

    public double doSum(double currentAge, double years) {
        double sum;
        sum = currentAge + years;
        System.out.println(getName() + " has " + currentAge + " years and will have " + sum + " years in " +
                years + " years!");
        return sum;
    }

    public double multiplyMass(int mass, double massCoefficient){
        double massProduct;
        massProduct=mass*massCoefficient;
        System.out.println(getName()+" has the mass of "+massProduct);
        return  massProduct;
    }

    public int multiplyMass(int mass, int massCoefficient){
        int massProduct;
        massProduct=mass*massCoefficient;
        System.out.println(getName()+" has the mass of "+massProduct);
        return  massProduct;
    }



    public double massModulo(int mass, double massCoefficient){
        double massModuloVar;
        massModuloVar=mass%massCoefficient;
        System.out.println(getName() + " has a mass module of: "+massModuloVar);
        return massModuloVar;
    }

    public int massModulo(int mass, int massCoefficient){
        int massModuloVar;
        massModuloVar=mass%massCoefficient;
        System.out.println(getName() + " has a mass module of: "+massModuloVar);
        return massModuloVar;
    }

    public int incrementIntelligence(int iq){

        iq++;
        System.out.println(getName()+" new iq is: " + iq);
        return(iq);
    }

    public int decrementIntelligence(int iq){

        iq--;
        System.out.println(getName()+" new iq is: " + iq);
        return(iq);
    }

    public double decrementIntelligence(double iq){

        iq--;
        System.out.println(getName()+" new iq is: " + iq);
        return(iq);
    }
}
