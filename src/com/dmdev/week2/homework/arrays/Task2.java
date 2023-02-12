package com.dmdev.week2.homework.arrays;

import java.util.Arrays;

/**
 * Задание 2
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Task2 {
    public static void main(String[] args) {
        char[] arrayChar = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        int[] result = changeCharToInt(arrayChar);
        System.out.println(Arrays.toString(arrayChar));
        System.out.println(Arrays.toString(changeCharToInt(arrayChar)));
        printElementMoreABSInArrayInt(result);
    }

    private static int[] changeCharToInt(char[] arrayChar) {
        int[] result = new int[arrayChar.length];
        for (int i = 0; i < arrayChar.length; i++) {
            result[i] = arrayChar[i];
        }
        return result;
    }

    private static void printElementMoreABSInArrayInt(int[] result) {
        double abs = 0;
        double sum = 0;
        for (int j : result) {
            sum += j;
        }
        abs = sum / result.length;
        System.out.println("среднее арифметическое = " + abs);
        System.out.print("элементы массива, которые больше среднего арифметического: ");
        for (int j : result) {
            if (j > abs) {
                System.out.print(j + " ");
            }
        }
    }
}
