package com.dmdev.week8.practics;

import java.util.ArrayList;
import java.util.List;

import static com.dmdev.week8.practics.Detail.addDetailFirstNight;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Detail> detailList = new ArrayList<>(addDetailFirstNight());
        List<Detail> detailListGoodScientist = new ArrayList<>();
        List<Detail> detailListBadScientist = new ArrayList<>();
        Assistant goodAssistant = null;
        Assistant badAssistant = null;

        for (int i = 1; i <= 100; i++) {
            goodAssistant = new Assistant("Вася", detailList, detailListGoodScientist);
            badAssistant = new Assistant("Петя", detailList, detailListBadScientist);
            Thread goodAssistantThread = new Thread(goodAssistant);
            Thread badAssistantThread = new Thread(badAssistant);

            Factory factory = new Factory(detailList);
            Thread factoryThread = new Thread(factory);

            factoryThread.start();
            factoryThread.join();
            goodAssistantThread.start();
            badAssistantThread.start();
            System.out.println("прошло " + i + " дней");
            System.out.println("******************************");
        }

        System.out.println();
        System.out.println("***************ИТОГ***************");
        System.out.println(goodAssistant.getName() + " собрал " + goodAssistant.getDetailListScientist().size());
        System.out.println("******************************");
        System.out.println(badAssistant.getName() + " собрал " + badAssistant.getDetailListScientist().size());
    }
}
