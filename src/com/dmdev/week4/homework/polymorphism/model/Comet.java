package com.dmdev.week4.homework.polymorphism.model;

import com.dmdev.week4.homework.polymorphism.Flying;

public abstract class Comet extends CosmicBody implements Flying {

    private int periodicity;

    public Comet(String name, int mass, int distanceToDeathStar, boolean atmosphere, int periodicity) {
        super(name, mass, distanceToDeathStar, atmosphere);
        this.periodicity = periodicity;
    }

    public int getPeriodicity() {
        return periodicity;
    }
}
