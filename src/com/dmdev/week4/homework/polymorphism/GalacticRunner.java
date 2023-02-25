package com.dmdev.week4.homework.polymorphism;

import com.dmdev.week4.homework.polymorphism.abstrackt.*;
import com.dmdev.week4.homework.polymorphism.comet.Galley;
import com.dmdev.week4.homework.polymorphism.comet.Kohouteck;
import com.dmdev.week4.homework.polymorphism.planet.Korusant;
import com.dmdev.week4.homework.polymorphism.planet.Nabu;
import com.dmdev.week4.homework.polymorphism.planet.Population;
import com.dmdev.week4.homework.polymorphism.planet.Tatuin;
import com.dmdev.week4.homework.polymorphism.satellite.Skcarif;
import com.dmdev.week4.homework.polymorphism.satellite.Utapau;
import com.dmdev.week4.homework.polymorphism.star.DeathStar;
import com.dmdev.week4.homework.polymorphism.star.FunStar;

import static com.dmdev.week4.homework.polymorphism.planet.Population.*;
import static com.dmdev.week4.homework.polymorphism.utils.SpaceUtils.*;

public class GalacticRunner {

    public static void main(String[] args) {

        Planet korusant = new Korusant("Korusant", 280, 785, true, 40, SMALL);
        Planet nabu = new Nabu("Nabu", 350, 1432, false, 67, AVERAGE);
        Planet tatuin = new Tatuin("Tatuin", 670, 1500, true, 76, BIG);

        Satellite skariff = new Skcarif("Skariff", 88, 800, false, korusant);
        Satellite utapau = new Utapau("Utapau", 55, 1600, false, tatuin);

        Star deathStar = new DeathStar("DeathStar", 8000, 0, false);
        Star funStar = new FunStar("FunStar", 10000, 1_000_000, false);

        Comet galley = new Galley("Galley", 300, getDistanceCometToDeathStar(), false, 76);
        Comet kohoutek = new Kohouteck("Kohouteck", 200, getDistanceCometToDeathStar(), false, 150);

        info(korusant, nabu, tatuin, skariff, utapau, deathStar, funStar, galley, kohoutek);
        System.out.println("Расстояние между " + korusant.getName()
                           + " и " + tatuin.getName() + " = " + determinationOfForceOfGravity(korusant, tatuin));

    }

    public static void info(CosmicBody... cosmicBodies) {
        for (CosmicBody cosmicBody : cosmicBodies) {
            cosmicBody.printInfo();
            cosmicBody.printBasicData();
            if (cosmicBody instanceof Planet) {
                ((Planet) cosmicBody).printInfoPopulation();
            }
            System.out.println("Гравитация на " + cosmicBody.getName() + " = " + cosmicBody.gravityCalculation());
            System.out.println(cosmicBody.getName() + " является звездой? " + isStar(cosmicBody));
            System.out.println();
        }
    }
}
