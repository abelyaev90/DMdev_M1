package com.dmdev.week1.houmework;

/**
 * Задание 2
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class Task2 {

    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 0;
        char operation = '/';

        if (isValidOperand(operand2, operation)) {
            System.out.println("Вы ввели некорректное значение, на " + operand2 + " делить нельзя");
        } else {
            System.out.println("Результат вычислений = " + calculatingResultOverTwoOperands(operand1, operand2, operation));
        }
    }

    private static double calculatingResultOverTwoOperands(double operand1, double operand2, char operation) {
        if (operation == '+') {
            return operand1 + operand2;
        } else if (operation == '-') {
            return operand1 - operand2;
        } else if (operation == '*') {
            return operand1 * operand2;
        } else if (operation == '/' && operand2 != 0) {
            return operand1 / operand2;
        } else {
            return operand1 % operand2;
        }
    }

    private static boolean isValidOperand(double operand2, char operation) {
        return operand2 == 0 && (operation == '/' || operation == '%');
    }
}
