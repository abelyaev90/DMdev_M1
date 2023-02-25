package com.dmdev.week4.homework.polymorphism.star;

import com.dmdev.week4.homework.polymorphism.abstrackt.Star;

public class DeathStar extends Star {

    public DeathStar(String name, int mass, int distanceToDeathStar, boolean atmosphere) {
        super(name, mass, distanceToDeathStar, atmosphere);
    }

    @Override
    public int gravityCalculation() {
        return 0;
    }

    @Override
    public void printInfo() {
        System.out.println("При достижении Звезды Смерти искажается время");
    }

    @Override
    public void printBasicData() {
        super.printBasicData();
    }
}
