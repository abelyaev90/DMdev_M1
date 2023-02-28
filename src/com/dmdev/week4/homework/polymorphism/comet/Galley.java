package com.dmdev.week4.homework.polymorphism.comet;

import com.dmdev.week4.homework.polymorphism.model.Comet;

public class Galley extends Comet {

    public Galley(String name, int mass, int distanceToDeathStar, boolean atmosphere, int periodicity) {
        super(name, mass, distanceToDeathStar, atmosphere, periodicity);
    }


    @Override
    public int speed() {
        return 1000;
    }

    @Override
    public int gravityCalculation() {
        return 0;
    }

    @Override
    public void printInfo() {
        System.out.println( getName() + " полетает 1 раз в " + getPeriodicity() + " лет");
    }
}
