package com.dmdev.week8.newhomework.model;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Rocket {

    private final Map<Crystal, Integer> crystals = new EnumMap<Crystal, Integer>(Crystal.class);
    private final String name;

    public Rocket(String name) {
        this.name = name;
    }

    public void addCrystal(List<Crystal> list) {
        list.forEach(crystal -> crystals.merge(crystal, 1, Integer::sum));
    }

    public String getName() {
        return name;
    }

    /**
    продумать логику наполнения до 500 кристаллов
     */
}
