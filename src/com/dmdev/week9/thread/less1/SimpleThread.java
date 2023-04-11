package com.dmdev.week9.thread.less1;

public class SimpleThread extends Thread{

    @Override
    public void run() {
        setName("customThread");
        System.out.println("Hello " + getName() + ": " + getState());
    }
}
