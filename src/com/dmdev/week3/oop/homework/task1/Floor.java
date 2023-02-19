package com.dmdev.week3.oop.homework.task1;

public class Floor {

    private int numberFloor;
    private Apartment[] apartments;

    public Floor(int numberFloor, Apartment[] apartments) {
        this.numberFloor = numberFloor;
        this.apartments = apartments;
    }

    public void print() {
        System.out.println("Номер этажа: " + numberFloor + ", количество квартир: " + apartments.length);
    }

    public int getNumberFloor() {
        return numberFloor;
    }

    public Apartment[] getApartments() {
        return apartments;
    }
}
