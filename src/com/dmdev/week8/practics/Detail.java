package com.dmdev.week8.practics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Detail {

    HEAD,
    BODY,
    LEFTLEG,
    RIGHTLEG,
    LEFTHAND,
    RIGHTHAND,
    CPU,
    RAM,
    HDD;

    private static final List<Detail> VALUES =
            List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Detail getRandomDetail() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static List<Detail> addDetailFirstNight() {
        List<Detail> firstList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Detail randomDetail = getRandomDetail();
            firstList.add(randomDetail);
        }
        return firstList;
    }

}
