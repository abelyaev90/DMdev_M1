package com.dmdev.week9.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task2 {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String format = now.format(formatter);

        System.out.println(now);
        System.out.println(format);
    }
}
