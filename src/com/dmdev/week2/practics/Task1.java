package com.dmdev.week2.practics;

/**
 * Задача 1.
 * Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */
public class Task1 {
    public static void main(String[] args) {
        int number = 1002;
        printSumOfDigits(number);
    }

    //12345 -> 12345%10 5; 12345/10 = 1234, 1234%10 4;....12/10 = 1 1%10 = 0
    private static void printSumOfDigits(int number) {
        int result = 0;
        System.out.println("вы ввели число = " + number);
        if (number < 0) {
            number = -number;
        }
        for (int current = number; current > 0; current /= 10) {
            result += current % 10;
        }
        System.out.println("cумма цифр числа = " + result);
    }
}
