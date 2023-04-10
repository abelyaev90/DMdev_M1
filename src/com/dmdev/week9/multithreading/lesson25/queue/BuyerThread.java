package com.dmdev.week9.multithreading.lesson25.queue;

import java.util.Queue;

/**
 * Правильно понимаю?
 *
 * 1) Как в принципе поток, который не успел первый захватить монитор, переходит в состояние wait?
 * Фактически ведь когда 1-й объект выполнил synchronized (cashboxes) - другие объект не могу синхронизироваться на
 * cashboxes? Правильно? В какое тогда они переходят состояние?
 *
 * Когда на объекте вызвали wait, при этом находясь в synchronized блоке - фактически любой другой поток может
 * захватить этот монитор (cashboxes), если был вызван метод notifyAll или notify, получается что как буд - то
 * "заканчивает работать" синхронизация (освобождается монитор)?
 * В 54 строке, потоки, которые не успели захватить кассу кто вызывает cashboxes.wait()? Поток, который не успел
 * захватить монитор и попал в else?
 * Таким образом получается след. картина:
 * 1-й поток захватил кассу
 * 2-й поток захватил кассу
 * 3-й поток ждет
 * 4-й поток ждет
 * 1-й поток освобождает кассу (вызывает  cashboxes.notifyAll() и этот поток уже освободил монитор)
 * 3-й поток первым проснулся - он заходит в 40 строчку? Т.е. фактически в данной реализации 9 потоков запущены - запущен
 * один раз метод run у каждого потока? После освобождения кассы - метод выходит из метода run и больше не претендует на кассы?
 *
 *  cashboxes.wait() в блоке else как раз позволяет другим потокам также запустить метод run и попробовать захватить монитор?
 */

public class BuyerThread implements Runnable {

    private final Queue<Cashbox> cashboxes;

    public BuyerThread(Queue<Cashbox> cashboxes) {
        this.cashboxes = cashboxes;
    }

    @Override
    public void run() {
        try {
            synchronized (cashboxes) {
                while (true) {
                    if (!cashboxes.isEmpty()) {
                        Cashbox cashbox = cashboxes.remove();
                        System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);

                        cashboxes.wait(5L);

                        System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
                        cashboxes.add(cashbox);
                        cashboxes.notifyAll();
                        break;
                    } else {
                        System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу ");
                        cashboxes.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


//    @Override
//    public void run() {
//        try {
//            while (true) {
//                if (!cashboxes.isEmpty()) {
//                    Cashbox cashbox = cashboxes.remove();
//                    System.out.println(Thread.currentThread().getName() + " обслуживается в кассе " + cashbox);
//                    Thread.sleep(5L);
//
//                    System.out.println(Thread.currentThread().getName() + " освобождаю кассу " + cashbox);
//                    cashboxes.add(cashbox);
//                    break;
//                } else {
//                    System.out.println(Thread.currentThread().getName() + " ожидает свободную кассу ");
//                    Thread.sleep(5L);
//                }
//            }
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
}

