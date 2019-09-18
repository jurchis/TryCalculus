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

        //The overloaded methods are depending on the input corpus
        //The overloaded methods have been called below
        //A good test to see is in the case of "decreaseFeelings" method
        man.doSum(man.getCurrentAge(), man.getYears());
        man.doSum(man.getCurrentAge(), man.getYears());

        alien.doSum(alien.getCurrentAge(), alien.getYears());
        alien.doSum(alien.getCurrentAge(), alien.getYears());

        man.decreaseFeelings(man.getFeelingsLevel(),15);
        man.decreaseFeelings(man.getFeelingsLevel(),15.0);

        man.multiplyMass(man.getMass(), man.getMassCoefficient());
        man.multiplyMass(man.getMass(), man.getMassCoefficient());

        alien.multiplyMass(alien.getMass(), alien.getMassCoefficient());
        alien.multiplyMass(alien.getMass(), alien.getMassCoefficient());

        man.massModulo(man.getMass(),man.getMassCoefficient());
        man.massModulo(man.getMass(),man.getMassCoefficient());

        alien.massModulo(alien.getMass(),alien.getMassCoefficient());
        alien.massModulo(alien.getMass(),alien.getMassCoefficient());

        man.incrementIntelligence(man.getIq());
        man.incrementIntelligence(man.getIq());

        alien.decrementIntelligence(alien.getIq());
        alien.decrementIntelligence(alien.getIq());
    }
}
