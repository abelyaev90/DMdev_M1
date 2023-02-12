package com.dmdev.week1.houmework;

/**
 * Задание 3
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class Task3 {

    public static void main(String[] args) {
        int sideTriangleA1 = 9;
        int sideTriangleB1 = 4;

        int sideTriangleA2 = 9;
        int sideTriangleB2 = 4;

        if (isValidSide(sideTriangleA1, sideTriangleA2) || isValidSide(sideTriangleA2, sideTriangleB2)) {
            System.out.println("Вы ввели невалидные данные. Сторона треугольника не может быть <= 0");
        } else {
            double areaTriangle1 = areaOfATriangle(sideTriangleA1, sideTriangleB1);
            double areaTriangle2 = areaOfATriangle(sideTriangleA2, sideTriangleB2);
            triangleAreaComparison(areaTriangle1, areaTriangle2);
        }

    }

    private static boolean isValidSide(int sideTriangleA1, int sideTriangleA2) {
        return sideTriangleA1 <= 0 || sideTriangleA2 <= 0;
    }

    private static void triangleAreaComparison(double areaTriangle1, double areaTriangle2) {
        if (areaTriangle1 > areaTriangle2) {
            printArea(areaTriangle1, areaTriangle2);
            System.out.println("Больше треугольник площадью " + areaTriangle1);
        } else if (areaTriangle1 < areaTriangle2) {
            printArea(areaTriangle1, areaTriangle2);
            System.out.println("Больше треугольник площадью " + areaTriangle2);
        } else
            printArea(areaTriangle1, areaTriangle2);
        System.out.println(areaTriangle1 + " равен " + areaTriangle2);
    }

    private static void printArea(double areaTriangle1, double areaTriangle2) {
        System.out.println("Площадь первого треугольника = " + areaTriangle1);
        System.out.println("Площадь второго треугольника = " + areaTriangle2);
    }

    private static double areaOfATriangle(int sideTriangleA1, int sideTriangleB1) {
        return 0.5 * (sideTriangleA1 / sideTriangleB1);
    }
}
