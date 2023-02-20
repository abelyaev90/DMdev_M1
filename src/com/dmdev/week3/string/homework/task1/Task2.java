package com.dmdev.week3.string.homework.task1;

import java.util.Arrays;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {
    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println(value);
        int[] result = arrayInt(value);
        int sumResult = sumArrayElements(value);
        System.out.println(Arrays.toString(result));
        System.out.println(sumResult);
    }

    private static int[] arrayInt(String value) {

        char[] chars = value.toCharArray();
        StringBuilder str = new StringBuilder();
        int count = 0;
        for (char aChar : chars) {

            if (Character.isDigit(aChar)) {
                str.append(aChar);
                count++;
            }
        }

        int[] array = new int[count];
        char[] charsNumber = str.toString().toCharArray();
        for (int i = 0; i < charsNumber.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(charsNumber[i]));
        }

        return array;
    }

    private static int sumArrayElements(String value) {
        int[] array = arrayInt(value);
        int result = 0;
        for (int j : array) {
            result += j;
        }
        return result;
    }

}
