package com.dmdev.week3.oop.homework.task1;

public class HouseRunner {

    public static void main(String[] args) {
        Room room1 = new Room(false);
        Room room2 = new Room(true);
        Room room3 = new Room(true);
        Room room4 = new Room(false);
        Room[] roomsForFirstApartment = {room1, room2, room3, room4};
        Room[] roomsForSecondApartment = {room1, room2};
        Room[] roomsForThirdApartment = {room1, room2, room3};

        Apartment apartment1 = new Apartment(1, roomsForFirstApartment);
        Apartment apartment2 = new Apartment(2, roomsForSecondApartment);
        Apartment apartment3 = new Apartment(3, roomsForThirdApartment);
        Apartment[] apartments = {apartment1, apartment2, apartment3};

        Floor floor1 = new Floor(1, apartments);
        Floor floor2 = new Floor(2, apartments);
        Floor floor3 = new Floor(3, apartments);
        Floor floor4 = new Floor(4, apartments);
        Floor floor5 = new Floor(5, apartments);
        Floor[] floors = {floor1, floor2, floor3, floor4, floor5};

        House house = new House(14, floors);

        room1.print();
        apartment1.print();
        floor1.print();
        house.print();
        System.out.println("******");

        printAllInformation(house);
    }

    private static void printAllInformation(House house) {
        house.print();
        int countNumberApartment = 1;
        for (Floor floor : house.getFloors()) {
            System.out.println("***NEXT FLOOR***");
            floor.print();
            for (Apartment apartment : floor.getApartments()) {
                apartment.setNumberApartment(countNumberApartment);
                apartment.print();
                countNumberApartment++;
                for (Room room : apartment.getRooms()) {
                    room.print();
                }
            }
        }
    }
}
