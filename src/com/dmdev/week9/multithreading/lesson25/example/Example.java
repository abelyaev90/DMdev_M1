package com.dmdev.week9.multithreading.lesson25.example;

/**
 * В 72. Потокобезопасный объект, Денис говорит о способах создания потокобезопасного объекта.
 * В конце видео (примерно 10-я минута) он говорит про 4 способа создания неизменяемого объекта.
 * 1) Не понимаю в чем разница 2-ого и 3-ого метода - по сути одно и тоже.
 * 2) Как правильно создавать потокобезопасный объект с помощью synchronized?
 *
 * Исходя из видео, я понля, что вот так:
 *
 *     public synchronized List<Integer> getList() {
 *         return list;
 *         //return new ArrayList<>(list);
 *     }
 *
 *  но это не работает(
 */

import java.util.ArrayList;
import java.util.List;

public class Example {

    private List<Integer> list;

    public Example(List<Integer> list) {
        this.list = list;
        //this.list = List.copyOf(list);
    }

    public synchronized List<Integer> getList() {
        return list;
        //return new ArrayList<>(list);
    }

    @Override
    public String toString() {
        return "Example{" +
               "list=" + list +
               '}';
    }
}
