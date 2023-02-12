package com.dmdev.week2.practics;

/**
 * Задача 2
 * Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
 * Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */

public class Task2 {
    public static void main(String[] args) {
        int number = 100;
        if (isValidNumber(number)) {
            printFibonacciSequenceWithFor(number);
            System.out.println("*******");
            printFibonacciSequenceWithRecursion(number);
        }

    }

    private static boolean isValidNumber(int number) {
        return number > 0;
    }

    private static void printFibonacciSequenceWithRecursion(int number) {

    }

    private static void printFibonacciSequenceWithFor(int number) {
        int n1 = 0;
        int n2 = 1;
        int result = 0;
        for (int i = 0; result < number; i++) {
            result = n1 + n2;
            n1 = n2;
            n2 = result;
            if (result > number) {
                break;
            }
            System.out.println(result);
        }

//        int n1 = 0;
//        int n2 = 1;
//        int result = 0;
//        while (result < number) {
//            result = n1 + n2;
//            n1 = n2;
//            n2 = result;
//            if (result > number) {
//                break;
//            }
//            System.out.println(result);
//        }
    }
}
