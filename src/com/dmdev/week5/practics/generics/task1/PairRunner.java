package com.dmdev.week5.practics.generics.task1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class PairRunner {

    public static void main(String[] args) {
//        Pair<String, Integer> pair = new Pair<>("w", 1);
//        System.out.println(pair);
//        System.out.println(PairUtil.swap(pair));

        List<String> listName = new ArrayList<>();

        listName.add("Petr");
        listName.add("Alex");
        listName.add("Sveta");
        listName.add("Tom");
        listName.add("Nick");

        System.out.println(listName);

        //listName.remove(1);

        Iterator<String> iterator = listName.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            iterator.remove();
        }

//        Iterator<String> iterator = listName.iterator();
//
//        iterator.next();
//        listName.remove(3);
//        iterator.next();


        System.out.println(listName);

    }
}
