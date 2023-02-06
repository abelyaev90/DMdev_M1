package com.dmdev.week1.lesson16;

/*
1. Дан порядковый номер месяца. Вывести на консоль пору года, к которой относится месяц.
* */

public class Task1 {

    public static void main(String[] args) {
        int numberMonth = 10;

        if (numberMonth == 12 || numberMonth == 1 || numberMonth == 2) {
            System.out.println("Winter");
        } else if (3 <= numberMonth && numberMonth <= 5) {
            System.out.println("Spring");
        } else if (6 <= numberMonth && numberMonth <= 8) {
            System.out.println("Summer");
        } else if (9 <= numberMonth && numberMonth <= 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid numberMonth: " + numberMonth);
        }
    }
}
