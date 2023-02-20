package com.dmdev.week3.string.practics.task1;

/**
 * Задача 1
 * Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях.
 */

public class Task1 {
    public static void main(String[] args) {
        String text = "Tenet";
        System.out.println(isPalindrome(text));
    }

    private static Boolean isPalindrome(String text) {

        char[] chars = text.toLowerCase().toCharArray();
        StringBuilder str = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            str.append(chars[i]);
        }

        return text.toLowerCase().contentEquals(str);
    }
}
