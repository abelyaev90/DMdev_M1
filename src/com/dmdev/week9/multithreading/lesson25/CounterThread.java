package com.dmdev.week9.multithreading.lesson25;

public class CounterThread extends Thread {

    private final Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 900; i++) {
            counter.increment();
        }
    }
}
