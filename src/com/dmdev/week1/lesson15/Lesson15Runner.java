package com.dmdev.week1.lesson15;

public class Lesson15Runner {

    public static void main(String[] args) {
        var month = 1;

        String result = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Autumn";
            default -> "Month is invalid";
        };

        System.out.println(result);
    }
}
