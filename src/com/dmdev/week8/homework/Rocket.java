package com.dmdev.week8.homework;

import java.util.List;

public class Rocket implements Runnable{

    private final String name;

    private final List<Crystal> crystalList;
    private final List<Crystal> crystalListMagic;

    public Rocket(String name, List<Crystal> crystalList, List<Crystal> crystalListMagic) {
        this.name = name;
        this.crystalList = crystalList;
        this.crystalListMagic = crystalListMagic;
    }

    @Override
    public void run() {
        synchronized (crystalList) {
            if (!crystalList.isEmpty()) {
                crystalListMagic.addAll(crystalList);
                System.out.println(name + " подобрал ");
                crystalList.forEach(System.out::println);
                crystalList.clear();
                System.out.println("Теперь у " + name + " в коллекции " + crystalListMagic.size() + " кристаллов");
            } else {
                System.out.println("С планеты собрали все кристаллы");
            }
        }
    }

    public String getName() {
        return name;
    }

    public List<Crystal> getCrystalListMagic() {
        return crystalListMagic;
    }
}
