package com.dmdev.week4.practics.computer;

public class OopLessonRunner {

    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(500);

        Computer computer = new Computer() {
//            @Override
//            public void load() {
//                System.out.println("print abstractClass ");
//            }
        };

       // computer.load();
        computer.setRam(ram);
        System.out.println(computer.getRam().getValue());

//        Laptop laptop = new Laptop(new Ssd(250), new Ram(512), 2);
//        laptop.open();
//        laptop.load();
//
//        System.out.println(laptop.getRam().getValue());
//        System.out.println(laptop.getSsd().getValue());

    }
}
