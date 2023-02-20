package com.dmdev.week3.string.homework.task1;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {
    public static void main(String[] args) {
        String line = "abc Cpddd Dio OsfWw";
        System.out.println(changeLine(line));
    }

    private static String changeLine(String line) {
        char[] chars = line.toCharArray();
        StringBuilder stringNotSpace = new StringBuilder();
        char space = ' ';
        for (char aChar : chars) {
            if (aChar != space)
                stringNotSpace.append(aChar);
        }
        char[] charsToUpperCase = stringNotSpace.toString().toUpperCase().toCharArray();
        StringBuilder resultString = new StringBuilder();
        for (int i = 0; i < charsToUpperCase.length; i++) {
            int j = i + 1;
            if (charsToUpperCase[i] != charsToUpperCase[j]) {
                resultString.append(charsToUpperCase[i]);
            }
            if (j + 1 == charsToUpperCase.length) {
                resultString.append(charsToUpperCase[j]);
                break;
            }
        }
        return resultString.toString();
    }
}
