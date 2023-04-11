package com.dmdev.week9.multithreading.lesson25.example;

import java.util.ArrayList;
import java.util.List;

public class ExampleRunner {

    public static void main(String[] args) {
        Example example = new Example(new ArrayList<>());
        List<Integer> list = example.getList();
        list.add(3);
        System.out.println(list);
        System.out.println(example.getList());
    }
}
