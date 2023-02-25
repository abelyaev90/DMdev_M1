package com.dmdev.week4.homework.polymorphism.abstrackt;

import com.dmdev.week4.homework.polymorphism.abstrackt.CosmicBody;
import com.dmdev.week4.homework.polymorphism.abstrackt.Planet;

public abstract class Satellite extends CosmicBody {

    Planet planet;

    public Satellite(String name, int mass, int distanceToDeathStar, boolean atmosphere, Planet planet) {
        super(name, mass, distanceToDeathStar, atmosphere);
        this.planet = planet;
    }

    public void printWhoseSatellite() {
        System.out.println(getName() + " является спутником " + planet.getName());
    }

    public Planet getPlanet() {
        return planet;
    }
}
