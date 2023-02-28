package com.dmdev.week4.homework.polymorphism.planet;

import com.dmdev.week4.homework.polymorphism.Living;
import com.dmdev.week4.homework.polymorphism.model.Planet;

import static com.dmdev.week4.homework.polymorphism.utils.SpaceUtils.*;

public class Korusant extends Planet implements Living {

    Population population;

    public Korusant(String name, int mass, int distanceToDeathStar, boolean atmosphere, int radius, Population population) {
        super(name, mass, distanceToDeathStar, atmosphere, radius);
        this.population = population;
    }

    @Override
    public int diameter(Planet planet) {
        return super.diameter(planet);
    }

    @Override
    public void printMassComparison(Planet planet) {
        super.printMassComparison(planet);
    }

    @Override
    public int gravityCalculation() {
        if (isAtmosphere()) {
            return getMass() * getDistanceToDeathStar() * ATTRACTION_WITH_ATMOSPHERE;
        } else {
            return getMass() * getDistanceToDeathStar() * ATTRACTION_NOT_ATMOSPHERE;
        }
    }

    @Override
    public void printInfo() {
        System.out.println("Korusant является центром Галактики с нулевыми координатами (0,0,0)" +
                           " на космических картах и местонахождением Галактического сената" +
                           " с самых ранних дней Галактической Республики.");

    }

    @Override
    public boolean isLiving() {
        return isAtmosphere() && getDistanceToDeathStar() > LIFE_DISTANCE;
    }

    @Override
    public Population getPopulation() {
        return population;
    }
}
