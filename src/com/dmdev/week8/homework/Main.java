package com.dmdev.week8.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Crystal> fireMageCrystalList = new ArrayList<>();
        List<Crystal> airMageCrystalList = new ArrayList<>();
        List<Crystal> crystalList = new ArrayList<>();
        Rocket fireMageRocket = null;
        Rocket airMageRocket = null;

        int i = 0;
        while (i < 1) {
            fireMageRocket = new Rocket("fireMageRocket", crystalList, fireMageCrystalList);
            airMageRocket = new Rocket("airMageRocket", crystalList, airMageCrystalList);
            Thread fireRocketThread = new Thread(fireMageRocket);
            Thread airRocketThread = new Thread(airMageRocket);

            Planet planet = new Planet(crystalList);
            Thread planetThread = new Thread(planet);

            planetThread.start();
            planetThread.join();
            fireRocketThread.start();
            airRocketThread.start();
            if (findAllCrystal(fireMageCrystalList, airMageCrystalList)) {
                i = 1;
            }

        }

        System.out.println(fireMageRocket.getName() + " собрал " + fireMageRocket.getCrystalListMagic().size());
        System.out.println(airMageRocket.getName() + " собрал " + airMageRocket.getCrystalListMagic().size());


    }

    private static boolean findAllCrystal(List<Crystal> fireMageCrystalList, List<Crystal> airMageCrystalList) {
        return getCountCrystal(fireMageCrystalList, Crystal.RED) == 500 &&
               getCountCrystal(fireMageCrystalList, Crystal.WHITE) == 500 ||
               getCountCrystal(airMageCrystalList, Crystal.RED) == 500 &&
               getCountCrystal(airMageCrystalList, Crystal.WHITE) == 500;
    }

    private static long getCountCrystal(List<Crystal> list, Crystal crystal) {
        return list.stream()
                .filter(x -> x.equals(crystal))
                .count();
    }
}
