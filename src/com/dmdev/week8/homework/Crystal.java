package com.dmdev.week8.homework;

import java.util.List;
import java.util.Random;

public enum Crystal {

    WHITE,
    RED;

    private static final List<Crystal> VALUES =
            List.of(values());
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Crystal getRandomCrystal() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

}
