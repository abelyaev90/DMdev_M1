package com.dmdev.week1.practics;

/*Задача 1
Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.*/


public class Task1 {
    public static void main(String[] args) {
        int day = 4;
        int month = 12;
        int year = 1993;

        upDate(day, month, year);

    }


    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static boolean isDecemberMonth(int month) {
        return month == 12;
    }

    public static boolean isMonthFebruary(int month) {
        return month == 2;
    }

    public static boolean isThirtyOneDayInMonth(int month) {
        return month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10;
    }

    public static boolean isThirtyDayInMonth(int month) {
        return month == 4 || month == 6 || month == 9 || month == 11;
    }


    public static void upDate(int day, int month, int year) {

        printOldDate(day, month, year);

        if (isDecemberMonth(month)) {
            if (day == 31) {
                day = 1;
                month = 1;
                year++;
                printDate(day, month, year);
            } else if (day < 31 && day > 0) {
                day++;
                printDate(day, month, year);
            } else {
                printError();
            }
        } else if (isThirtyDayInMonth(month)) {
            if (day == 30) {
                day = 1;
                month++;
                printDate(day, month, year);
            } else if (day < 30 && day > 0) {
                day++;
                printDate(day, month, year);
            }
        } else if (isThirtyOneDayInMonth(month)) {
            if (day == 31) {
                day = 1;
                month++;
                printDate(day, month, year);
            } else if (day < 31 && day > 0) {
                day++;
                printDate(day, month, year);
            }
        } else if (isLeapYear(year)) {
            if (isMonthFebruary(month)) {
                if (day == 29) {
                    day = 1;
                    month++;
                    printDate(day, month, year);
                } else if (day < 29 && day > 0) {
                    day++;
                    printDate(day, month, year);
                }
            }
        } else if (isMonthFebruary(month)) {
            if (day == 28) {
                day = 1;
                month++;
                printDate(day, month, year);
            } else if (day < 28 && day > 0) {
                day++;
                printDate(day, month, year);
            }
        } else {
            printError();
        }

    }


    public static void printDate(int day, int month, int year) {
        System.out.println("Новая дата: " + day + "." + month + "." + year);
    }

    public static void printOldDate(int day, int month, int year) {
        System.out.println("Вы указали: " + day + "." + month + "." + year);
    }

    public static void printError() {
        System.out.println("вы указали некорректную дату");
    }

}
