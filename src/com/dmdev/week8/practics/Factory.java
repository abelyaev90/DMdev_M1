package com.dmdev.week8.practics;

import java.util.List;

import static com.dmdev.week8.practics.Detail.getRandomDetail;
import static com.dmdev.week8.practics.Night.NIGHT;
import static com.dmdev.week8.practics.util.RandomUtil.getRandom;

public class Factory implements Runnable {
    private final List<Detail> detailList;

    public Factory(List<Detail> detailList) {
        this.detailList = detailList;
    }

    @Override
    public void run() {
        synchronized (detailList) {
            int i = 0;
            do {
                detailList.add(getRandomDetail());
                i++;
            } while (i < getRandom(5));

            try {
                detailList.wait(NIGHT);
                System.out.println("наступила ночь");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("фабрика добавила на свалку " + detailList.size() + " деталей");
            detailList.forEach(System.out::println);

        }
    }

}
