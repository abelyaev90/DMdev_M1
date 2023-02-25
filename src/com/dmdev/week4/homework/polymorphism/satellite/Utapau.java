package com.dmdev.week4.homework.polymorphism.satellite;

import com.dmdev.week4.homework.polymorphism.abstrackt.Planet;
import com.dmdev.week4.homework.polymorphism.abstrackt.Satellite;

public class Utapau extends Satellite {

    public Utapau(String name, int mass, int distanceToDeathStar, boolean atmosphere, Planet planet) {
        super(name, mass, distanceToDeathStar, atmosphere, planet);
    }

    @Override
    public void printWhoseSatellite() {
        super.printWhoseSatellite();
    }

    @Override
    public void printInfo() {
        System.out.println(getName() + " является природным спутником");
    }

    @Override
    public int gravityCalculation() {
        return 0;
    }

    @Override
    public void printBasicData() {
        super.printBasicData();
    }
}
