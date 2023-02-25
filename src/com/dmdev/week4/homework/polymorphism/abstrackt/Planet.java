package com.dmdev.week4.homework.polymorphism.abstrackt;

import com.dmdev.week4.homework.polymorphism.planet.Population;

public abstract class Planet extends CosmicBody {

    private int radius;

    private Population population;

    public Planet(String name, int mass, int distanceToDeathStar, boolean atmosphere, int radius) {
        super(name, mass, distanceToDeathStar, atmosphere);
        this.radius = radius;
    }

    public int diameter(Planet planet) {
        return planet.radius * 2;
    }

    public void printMassComparison(Planet planet) {
        if (this.getMass() == planet.getMass()) {
            System.out.println(this.getMass() + " равна " + planet.getMass());
        } else if (this.getMass() > planet.getMass()) {
            System.out.println(this.getMass() + " больше " + planet.getMass());
        } else {
            System.out.println(this.getMass() + " меньше " + planet.getMass());
        }
    }


    public abstract void printInfoPopulation();

    public int getRadius() {
        return radius;
    }

    public Population getPopulation() {
        return population;
    }
}
