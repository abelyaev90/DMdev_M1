package com.dmdev.week3.oop.homework.task1;

/**
 * Задание 1
 * Представить в виде классов и их композиции следующую модель.
 * - Каждый дом содержит свой номер (int), и множество этажей (массив).
 * - Каждый этаж содержит номер этажа (int), и множество квартир (массив).
 * - Каждая квартира содержит свой номер (int), и множество комнат (массив).
 * - Каждая комната содержит поле проходная она или нет (boolean).
 * В каждом классе реализовать метод print, который на консоль выводит информацию об объекте (должны присутствовать все поля объекта!).
 * Например, метод print класса этаж должен выводить на консоль:
 * “Этаж 2, количество квартир 18”
 * Создание всех объектов вынести в отдельный класс с методом main.
 * Там же реализовать метод printAllInformation, который на вход принимает объект типа дом, и выводит информацию о нем, его этажах, квартирах и комнатах, вызывая методы print.
 */

public class House {
    private int numberHouse;
    private Floor[] floors;

    public House(int numberHouse, Floor[] floors) {
        this.numberHouse = numberHouse;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Номер дома: " + numberHouse + ", количество этажей: " + floors.length);
    }

    public int getNumberHouse() {
        return numberHouse;
    }

    public Floor[] getFloors() {
        return floors;
    }
}
