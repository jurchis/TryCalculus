package com.milnesium;


public class App 
{
    public static void main()
    {

        Human man = new Human();
        man.setName("Lorin");
        man.setCurrentAge(26);
        man.setYears(37);
        man.doSum(man.getCurrentAge(), man.getYears());

        System.out.println(man.getName());
    }
}
