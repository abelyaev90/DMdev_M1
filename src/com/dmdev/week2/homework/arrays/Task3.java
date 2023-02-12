package com.dmdev.week2.homework.arrays;

import java.util.Arrays;

/**
 * Задание 3
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * <p>
 * Пример:
 * <p>
 * [-4, -18]
 * <p>
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * <p>
 * [1, 9, 3]
 */

public class Task3 {
    public static void main(String[] args) {
        int[] array = {4, 0, 1, 9, 0, -18, 3};
        System.out.println(Arrays.deepToString(changeArrayToTwoDimensional(array)));
    }

    private static int[][] changeArrayToTwoDimensional(int[] array) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        for (int j : array) {
            if (j > 0) {
                countPositive++;
            } else if (j < 0) {
                countNegative++;
            } else {
                countZero++;
            }
        }

        int[][] result = new int[3][];
        result[0] = new int[countPositive];
        result[1] = new int[countNegative];
        result[2] = new int[countZero];
        int countPositiveSection = 0;
        int countNegativeSection = 0;
        int countZeroSection = 0;
        for (int k : array) {
            if (k > 0) {
                result[0][countPositiveSection] = k;
                countPositiveSection++;
            } else if (k < 0) {
                result[1][countNegativeSection] = k;
                countNegativeSection++;
            } else {
                result[2][countZeroSection] = k;
                countZeroSection++;
            }
        }
        return result;
    }
}
