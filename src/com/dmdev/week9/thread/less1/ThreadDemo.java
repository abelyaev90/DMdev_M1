package com.dmdev.week9.thread.less1;

/**
 *1) почему в 17 строке выводит: состояние Thread-0: RUNNABLE
 *а не состояние customThread: RUNNABLE, хотя для этого потока я засетил имя customThread
 */

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        SimpleThread simpleThread = new SimpleThread();
        Thread threadLambda = new Thread(() -> System.out.println("Hello from " + Thread.currentThread().getName()));
        threadLambda.setName("lambdaThread");
        Thread threadRunnable = new Thread(new SimpleRunnable());

        simpleThread.start();
        System.out.println("состояние " + simpleThread.getName() + ": " + simpleThread.getState() + " <------");
        threadLambda.start();
        threadRunnable.start();

        simpleThread.join();
        System.out.println("состояние " + simpleThread.getName() + ": " + simpleThread.getState());
        threadLambda.join();
        threadRunnable.join();

        System.out.println(Thread.currentThread().getName());
    }
}
