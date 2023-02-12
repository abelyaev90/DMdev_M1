package com.dmdev.week2.practics.fromlesson;

/**
 * 5. Написать программу, которая проходит циклом по английскому
 * алфавиту, начиная с буквы ‘b’, и выводит каждую букву до тех пор,
 * пока не встретит гласную (т.е. вывести согласные на консоль).
 */

public class Task5 {
    public static void main(String[] args) {
        char startChar = 'p';
        printLetters(startChar);
    }

    private static void printLetters(char startChar) {
        for (char currentChar = startChar; !isVawel(currentChar); currentChar++) {
            System.out.println(currentChar);
        }
    }

    private static boolean isVawel(char currentChar) {
        return currentChar == 'q'|| currentChar == 'e' || currentChar == 'y' || currentChar == 'u'||
         currentChar == 'o'|| currentChar == 'a' || currentChar == 'i';
    }
}
