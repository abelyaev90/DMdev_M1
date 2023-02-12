package com.dmdev.week2.practics.fromlesson;

/**
 * Написать программу высчитывающую факториал введённого целого числа.
 */

public class Task1 {

    public static void main(String[] args) {
        int value = 5;
        System.out.println(factorial(value));
        System.out.println(factorialWhile(value));
    }

    private static int factorialWhile(int value) {
        int result = 1;
        int currentValue = 1;
        while (currentValue <= value) {
            result *= currentValue;
            currentValue++;
        }
        return result;
    }

    private static int factorial(int value) {
        int result = 1;
        for (int currentValue = 1; currentValue <= value; currentValue++) {
            result *= currentValue;
        }
        return result;
    }
}
