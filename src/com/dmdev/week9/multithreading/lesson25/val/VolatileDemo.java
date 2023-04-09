package com.dmdev.week9.multithreading.lesson25.val;

/**
 * 1) Почему когда всего 2 потока (1-й и 6-й) и мы используем еще 1 переменную count
 * (выводим ее значение в sout в первом потоке) - меняется выполнение потоков?
 * Даже если эти обе переменные объявлены как volatile?
 * <p>
 * 2) почему когда у нас запущенно несколько потоков, при этом мы используем volatile переменные и join на каждом потоке
 * все равно код отрабатывает некорректно (после true все равно идет вывод с false)?
 */

public class VolatileDemo {

    // private static boolean flag;
    private static volatile boolean flag;
    // private static int count = 0;
    private static volatile int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            while (!flag) {
                System.out.println("flag = false");
                //System.out.println(count + ": flag = false");
                count++;
            }
        }
        );
        Thread thread2 = new Thread(() -> {
            while (!flag) {
                System.out.println("flag = false");
            }
        }
        );
        Thread thread3 = new Thread(() -> {
            while (!flag) {
                System.out.println("flag = false");
            }
        }
        );
        Thread thread4 = new Thread(() -> {
            while (!flag) {
                System.out.println("flag = false");
            }
        }
        );
        Thread thread5 = new Thread(() -> {
            while (!flag) {
                System.out.println("flag = false");
            }
        }
        );

        Thread thread6 = new Thread(() -> {
            flag = true;
            System.out.println("Still flag = true");
        });
        Thread.sleep(100L);

        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
        thread6.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();
        thread6.join();
    }
}
