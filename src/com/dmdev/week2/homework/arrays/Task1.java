package com.dmdev.week2.homework.arrays;

import java.util.Arrays;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * <p>
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class Task1 {
    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        int[] resultArray = changeArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(resultArray));
    }

    private static int[] changeArray(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j >= 0) {
                count++;
            }
        }

        int[] resultArray = new int[count];
        int currentIndex = 0;
        for (int j : array) {
            if (j >= 0) {
                resultArray[currentIndex] = j * count;
                currentIndex++;
            }
        }
        return resultArray;
    }
}
