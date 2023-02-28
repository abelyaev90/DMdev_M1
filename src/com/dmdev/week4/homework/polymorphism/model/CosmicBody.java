package com.dmdev.week4.homework.polymorphism.model;

public abstract class CosmicBody {

    private String name;
    private int mass;
    private int distanceToDeathStar;
    private boolean atmosphere;

    public CosmicBody(String name, int mass, int distanceToDeathStar, boolean atmosphere) {
        this.name = name;
        this.mass = mass;
        this.distanceToDeathStar = distanceToDeathStar;
        this.atmosphere = atmosphere;
    }

    public abstract int gravityCalculation();

    public abstract void printInfo();

    public void printBasicData() {
        System.out.println("Название " + getName());
        System.out.println("Масса " + getMass());
        System.out.println("Расстояние до Звезды Смерти " + getDistanceToDeathStar());
        System.out.println("Есть ли атмосфера? " + isAtmosphere());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public int getMass() {
        return mass;
    }

    public int getDistanceToDeathStar() {
        return distanceToDeathStar;
    }

    public boolean isAtmosphere() {
        return atmosphere;
    }
}
