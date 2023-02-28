package com.dmdev.week4.homework.polymorphism.model;

public abstract class Star extends CosmicBody {

    public Star(String name, int mass, int distanceToDeathStar, boolean atmosphere) {
        super(name, mass, distanceToDeathStar, atmosphere);
    }
}
