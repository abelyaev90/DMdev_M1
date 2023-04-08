package com.dmdev.week8.homework;

import java.util.List;

import static com.dmdev.week8.homework.util.Day.DAY;
import static com.dmdev.week8.homework.util.RandomUtil.getRandom;

public class Planet implements Runnable {

    private final List<Crystal> crystalList;

    public Planet(List<Crystal> crystalList) {
        this.crystalList = crystalList;
    }

    @Override
    public void run() {
        synchronized (crystalList) {
            int i = 2;
            do {
                crystalList.add(Crystal.getRandomCrystal());
                i++;
            } while (i < getRandom(6));

            System.out.println("На планете выросли: ");
            crystalList.forEach(System.out::println);

            try {
                crystalList.wait(DAY);
                System.out.println("Прошли сутки");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
