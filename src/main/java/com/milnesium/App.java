package com.milnesium;

public class App 
{
    public static void main( String[] args )
    {

        Human man = new Human();
        man.setName("Lorin");
        man.setCurrentAge(26);
        man.setYears(37);
        man.setFeelings(true);
        man.setFeelingsLevel(90);
        man.setMass(85);
        man.setIq(150);

        Alien alien = new Alien();
        alien.setName("Milnesium");
        alien.setCurrentAge(26);
        alien.setYears(37);
        alien.setArtificialFeelings(true);
        alien.setArtificialFeelingsLevel(30);
        alien.setMass(57);
        alien.setIq(200);

        man.doSum(man.getCurrentAge(), man.getYears());
        alien.doSum(alien.getCurrentAge(), alien.getYears());
        man.decreaseFeelings(man.getFeelingsLevel(),15);
        //((Human) alien).increaseFeelings(((Human) alien).getFeelingsLevel(), 10);
        man.multiplyMass(man.getMass(), man.getMassCoefficient());
        alien.multiplyMass(alien.getMass(), alien.getMassCoefficient());
        man.massModulo(man.getMass(),man.getMassCoefficient());
        alien.massModulo(alien.getMass(),alien.getMassCoefficient());
        man.incrementIntelligence(man.getIq());
        alien.decrementIntelligence(alien.getIq());
    }
}
