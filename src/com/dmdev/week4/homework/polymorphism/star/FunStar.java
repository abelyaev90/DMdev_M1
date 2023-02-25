package com.dmdev.week4.homework.polymorphism.star;

import com.dmdev.week4.homework.polymorphism.abstrackt.Star;

public class FunStar extends Star {

    public FunStar(String name, int mass, int distanceToDeathStar, boolean atmosphere) {
        super(name, mass, distanceToDeathStar, atmosphere);
    }

    @Override
    public int gravityCalculation() {
        return 0;
    }

    @Override
    public void printInfo() {
        System.out.println("все кто долетал до этой звезды, возвращались счастливыми");
    }

    @Override
    public void printBasicData() {
        super.printBasicData();
    }
}
