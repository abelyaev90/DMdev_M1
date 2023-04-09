package com.dmdev.week9.thread.less1;

public class SimpleRunnable implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("isRunnable thread");
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}
