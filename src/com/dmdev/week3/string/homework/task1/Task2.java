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
        arrayInt(value);
        sumArrayElements(value);
    }

    private static int[] arrayInt(String value) {
        int[] array = new int[1];
        char[] chars = value.toCharArray();
        StringBuilder str = new StringBuilder();
        char a0 = '0';
        char a1 = '1';
        char a2 = '2';
        char a3 = '3';
        char a4 = '4';
        char a5 = '5';
        char a6 = '6';
        char a7 = '7';
        char a8 = '8';
        char a9 = '9';
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
            if (chars[i] == a0 || chars[i] == a1 ||chars[i] == a2 ||chars[i] == a3 ||chars[i] == a4 ||chars[i] == a5 ||chars[i] == a6 ||chars[i] == a7 ||chars[i] == a8 || chars[i] == a9) {
                str.append(chars[i]);
            }
        }
        char[] charsResult = str.toString().toCharArray();
        System.out.println();
        System.out.println(charsResult);
        int[] result = new int[charsResult.length];
        for (int i = 0; i < charsResult.length; i++) {
            result[i] = charsResult[i];
            System.out.println(charsResult[i]);
            System.out.println();
            System.out.println(result[i]);
        }
        System.out.println(Arrays.toString(result));
        return array;
    }

    private static int sumArrayElements(String value) {
        return 0;
    }

}
