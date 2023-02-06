package com.dmdev.week1.lesson16;
/*2. Дано целое число. Определить, является ли последняя цифра этого числа – цифрой 3.*/

public class Task2 {
    public static void main(String[] args) {
        int number = -335;
        int end = 3;

        if (number % 10 == end || number % 10 == -end) {
            System.out.printf("Yes, remainder of the division %d on %d = %d", number, end,end);
        } else {
            System.out.printf("No! remainder of the division %d on %d != %d", number, end,end);
        }
    }
}
