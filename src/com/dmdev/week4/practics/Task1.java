package com.dmdev.week4.practics;

/**
 * Задача 1
 * Внимание. При выполнении задания держите в уме принцип инкапсуляции.
 * <p>
 * Создать класс Point, описывающий точку в двумерных координатах.
 * Полями этого класса должны быть координаты x и y.
 * Класс должен иметь один конструктор, принимающий координаты x и y.
 * <p>
 * Добавьте функционал для получения скрытой информации (координаты точки), а получить её можно только с помощью методов доступа (get/set).
 * <p>
 * Создать метод distance, принимающий объект Point и определяющий расстояние до неё.
 * <p>
 * Используя класс точки, создать класс Rectangle, описывающий прямоугольник.
 * <p>
 * В нём хранятся два поля типа Point - координаты левого верхнего и правого нижнего углов.
 * <p>
 * Создать следующие методы в классе Rectangle:
 * <p>
 * - Высчитывающий площадь прямоугольника
 * - Высчитывающий длину диагонали
 * <p>
 * Написать тестовый класс с методом main программу, демонстрирующим создание объекта класса Rectangle и применение вышеперечисленных методов.
 */

public class Task1 {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1);
        Point point2 = new Point(6, 6);

        Rectangle rectangle = new Rectangle(point1, point2);

        System.out.println(point1.distance(point2));
        System.out.println(rectangle.areaRectangle(rectangle));
        System.out.println(rectangle.diagonalLength(rectangle));

    }


}