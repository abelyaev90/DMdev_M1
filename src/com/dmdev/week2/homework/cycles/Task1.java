package com.dmdev.week2.homework.cycles;

/**
 * Задание 1
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 */

public class Task1 {
    public static void main(String[] args) {
        int value = 228910;
        int eventResult = sumEventNumbers(value);
        int oddResult = sumOddNumbers(value);
        System.out.println("Количество четных цифр в " + value + " = " + eventResult);
        System.out.println("Количество нечетных цифр в " + value + " = " + oddResult);
    }

    private static int sumEventNumbers(int value) {
        int countEvent = 0;
        for (int currentValue = (value > 0 ? value : value * (-1)); currentValue > 0; currentValue /= 10) {
            if ((currentValue % 10) % 2 == 0) {
                countEvent++;
            }
        }
        return countEvent;
    }

    private static int sumOddNumbers(int value) {
        int countOdd = 0;
        for (int currentValue = (value > 0 ? value : value * (-1)); currentValue > 0; currentValue /= 10) {
            if ((currentValue % 10) % 2 != 0) {
                countOdd++;
            }
        }
        return countOdd;
    }
}
