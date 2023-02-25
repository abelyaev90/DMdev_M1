package com.dmdev.week4.homework.polymorphism.utils;

import com.dmdev.week4.homework.polymorphism.abstrackt.CosmicBody;
import com.dmdev.week4.homework.polymorphism.abstrackt.Star;

public class SpaceUtils {

    public static final int LIFE_DISTANCE = 1000;
    public static final int ATTRACTION_WITH_ATMOSPHERE = 9;
    public static final int ATTRACTION_NOT_ATMOSPHERE = 4;

    public static double determinationOfForceOfGravity(CosmicBody firstCosmicBody, CosmicBody secondCosmicBody) {
        return Math.sqrt(firstCosmicBody.getDistanceToDeathStar() + secondCosmicBody.getDistanceToDeathStar() *
                (firstCosmicBody.getMass() * secondCosmicBody.getMass()) * 0.5);
    }

    public static int getDistanceCometToDeathStar() {
        return (int) (Math.random() * 1_500_880);
    }

    public static boolean isStar(CosmicBody cosmicBody) {
        return cosmicBody instanceof Star;
    }

}
