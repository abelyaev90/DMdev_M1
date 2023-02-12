package com.dmdev.week2.homework.cycles;

/**
 * Задание 2
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * <p>
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Task2 {
    public static void main(String[] args) {
        int value = -4508;
        int result = invertedValue(value);
        System.out.println("Введенное число = " + value + "; инвертированное число = " + result);
    }

    private static int invertedValue(int value) {
        int result = 0;

        int numb = 0;
        for (int currentValue = (value > 0 ? value : value * (-1)); currentValue > 0; currentValue /= 10) {
            numb = currentValue % 10;
            int count = 0;
            for (int i = currentValue / 10; i > 0; i /= 10) {
                count++;
            }
            result += numb * Math.pow(10, count);
        }
        return result;
    }
}
