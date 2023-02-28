package com.dmdev.week4.practics.less;

import static com.dmdev.week4.practics.less.Door.WOODING;

public abstract class Car {
    private String engine;
    private Door door;
    private int weels;

    public Car(String engine, Door door, int weels) {
        this.engine = engine;
        this.door = door;
        this.weels = weels;
    }

    @Override
    public String toString() {
        return "Car{" +
               "engine='" + engine + '\'' +
               ", door=" + door +
               ", weels=" + weels +
               '}';
    }
}

class SportCar extends Car {
    public SportCar(String engine, Door door, int weels) {
        super(engine, door, weels);
    }

    @Override
    public String toString() {
        return "SportCar{} " + super.toString();
    }
}

class Main {
    public static void main(String[] args) {
//        Car car = new Car() {
//        };
//
//        System.out.println(car);

        SportCar sportCar = new SportCar("dvs", WOODING, 4);
        System.out.println(sportCar);
    }
}

interface Readble {

    default byte[] read() {
        byte[] arr = new byte[9];
        return arr;
    }

    ;
}

class Human implements Readble {

}
