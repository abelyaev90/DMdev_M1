package com.dmdev.week4.homework.polymorphism.satellite;

import com.dmdev.week4.homework.polymorphism.model.Planet;
import com.dmdev.week4.homework.polymorphism.model.Satellite;

public class Skcarif extends Satellite {

    public Skcarif(String name, int mass, int distanceToDeathStar, boolean atmosphere, Planet planet) {
        super(name, mass, distanceToDeathStar, atmosphere, planet);
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " является искусственным спутником");

    }

    @Override
    public int gravityCalculation() {
        return 0;
    }

}
