package com.dmdev.week3.oop.homework.task1;

public class Apartment {
    private int numberApartment;
    private Room[] rooms;

    public Apartment(int numberApartment, Room[] rooms) {
        this.numberApartment = numberApartment;
        this.rooms = rooms;
    }

    public void print() {
        System.out.println("Номер квартиры: " + numberApartment + ", количество комнат: " + rooms.length);
    }

    public int getNumberApartment() {
        return numberApartment;
    }

    public void setNumberApartment(int numberApartment) {
        this.numberApartment = numberApartment;
    }

    public Room[] getRooms() {
        return rooms;
    }
}
