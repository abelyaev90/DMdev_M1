package com.dmdev.week2.practics.fromlesson;

/**
 * В 1626 году индейцы продали Манхэттен за 24$.
 * Написать программу, которая высчитывает сумму,
 * получившуюся бы в текущем году, если бы индейцы положили эти
 * деньги в банк под 5% годовых.
 */

public class Task3 {

    public static void main(String[] args) {
        int startYear = 1626;
        double sum = 24;
        double percent = 0.05;
        double result = calculate(sum, startYear, percent);
        System.out.println(result);
    }

    private static double calculate(double sum, int startYear, double percent) {
        double result = sum;
        for (int currentYear = startYear + 1; currentYear <= 2022; currentYear++) {
            result += result * percent;
            System.out.println(currentYear + " " + result);
        }
        return result;
    }
}
