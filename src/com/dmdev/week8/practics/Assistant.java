package com.dmdev.week8.practics;



import java.util.List;

public class Assistant implements Runnable {

    private final String name;
    private final List<Detail> detailList;
    private final List<Detail> detailListScientist;

    public Assistant(String name, List<Detail> detailList, List<Detail> detailListScientist) {
        this.name = name;
        this.detailList = detailList;
        this.detailListScientist = detailListScientist;
    }

    @Override
    public void run() {
        synchronized (detailList) {
            if (!detailList.isEmpty()) {
                detailListScientist.addAll(detailList);
                System.out.println(name + " подобрал ");
                detailList.forEach(System.out::println);
                detailList.clear();
                System.out.println("Теперь у " + name + " в коллекции " + detailListScientist.size() + " деталей");
            } else {
                System.out.println("На свалке больше нет деталей");
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Detail> getDetailListScientist() {
        return detailListScientist;
    }
}
