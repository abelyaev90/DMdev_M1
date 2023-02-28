package com.dmdev.week4.homework.polymorphism.planet;

import com.dmdev.week4.homework.polymorphism.Living;
import com.dmdev.week4.homework.polymorphism.model.Planet;

import static com.dmdev.week4.homework.polymorphism.utils.SpaceUtils.*;

public class Tatuin extends Planet implements Living {

    Population population;

    public Tatuin(String name, int mass, int distanceToDeathStar, boolean atmosphere, int radius, Population population) {
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
        System.out.println("Tatuin находится в регионе Внешнего Кольца на пересечении многих гиперпространственных маршрутов," +
                           " поэтому многие торговцы используют космопорт Мос-Эйсли в качестве пересадочной станции.");
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
