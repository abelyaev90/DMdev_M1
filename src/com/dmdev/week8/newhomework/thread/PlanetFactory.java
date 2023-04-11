package com.dmdev.week8.newhomework.thread;

import com.dmdev.week8.newhomework.model.Crystal;
import com.dmdev.week8.newhomework.model.Planet;
import com.dmdev.week8.newhomework.util.RandomUtil;
import com.dmdev.week8.practicsdmdev.util.NightConst;

import java.util.Collections;
import java.util.List;

public class PlanetFactory extends Thread {

    private static final int MAX_CRYSTAL_COUNT = 5;
    private final Night night;
    private final Planet planet;

    public PlanetFactory(Night night) {
        this(night, Collections.emptyList());
    }

    public PlanetFactory(Night night, List<Crystal> initialCrystalList) {
        this.planet = new Planet(initialCrystalList);
        this.night = night;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHT; i++) {
                throwNewCrystal();
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void waitNextNight() {
        int countCrystalThrowing = RandomUtil.getNextWithoutZero(MAX_CRYSTAL_COUNT);
        synchronized (planet.getLock()) {
            for (int i = 0; i < countCrystalThrowing; i++) {
                Crystal crystal = Crystal.CASHED_VALUES.get(RandomUtil.getNext(Crystal.CASHED_VALUES.size()));
                planet.add(crystal);
            }
            System.out.println("Планета произвела : " + countCrystalThrowing + " кристаллов");
        }
    }

    private void throwNewCrystal() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    public Planet getPlanet() {
        return planet;
    }
}
