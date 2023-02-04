package function.practics;

/*Задача 2
Написать программу, вычисляющую корни квадратного уравнения вида ax ² + bx + c = 0, где a, b и c - целочисленные параметры функции run.

Вывести корни квадратного уравнения на консоль.
Если их два, то перечислить каждый с новой строки в консоли (просто использовать два раза System.out.println).
Если дискриминант отрицательный, вывести на консоль сообщение "нет корней".

При решении создать и использовать следующие функции:

- функция isPositive, определяющая, является ли число положительным

- функция isZero, определяющая, является ли число нулём

- функция discriminant, вычисляющая дискриминант

Обращайте внимание, что параметры все целочисленные, а корни могут иметь дробную часть.*/

public class Task2 {
    public static void main(String[] args) {
        double a = 1;
        double b = 0;
        double c = -49;
        System.out.println("вы ввели уравнение: " + a + "x^2 + " + b + "x + " + c + " = 0;");
        System.out.println("где a = " + a);
        System.out.println("где b = " + b);
        System.out.println("где c = " + c);
        rootCalculation(a, b, c);

    }

    public static boolean isPositive(double number) {
        return number > 0;
    }

    public static boolean isZero(double number) {
        return number == 0;
    }

    public static double discriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    public static int numberOfRoots(double a, double b, double c) {
        if (discriminant(a, b, c) <= 0) {
            return 0;
        } else if (discriminant(a, b, c) == 0) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void rootCalculation(double a, double b, double c) {

        if (!isZero(a) && isZero(b) && isZero(c)) {
            System.out.println("Уравнение имеет 1 корень = " + 0);
        } else if (!isZero(a) && isZero(b) && !isZero(c)) {
            c = -c;
            if (c / a < 0) {
                System.out.println("уравнение не имеет корней");
            } else {
                double sqrt = Math.sqrt(Math.abs(-c / a));
                System.out.println("уравнение имеет 1-й корень = " + sqrt);
                System.out.println("уравнение имеет 2-й корень = " + -sqrt);
            }
        } else if (!isZero(a) && !isZero(b) && isZero(c)) {
            System.out.println("уравнение имеет 1-й корень = " + 0);
            System.out.println("уравнение имеет 2-й корень = " + -b / a);

        } else if (!isZero(a) && !isZero(b) && !isZero(c)) {
            if (numberOfRoots(a, b, c) < 0) {
                System.out.println("уравнение не имеет действительных корней");
            } else if (numberOfRoots(a, b, c) == 0) {
                System.out.println("уравнение имеет 1 корень = " + -b / (2 * a));
            } else {
                System.out.println("первый корень уравнения = " + (-b + Math.sqrt(discriminant(a, b, c))) / 2 * a);
                System.out.println("второй корень уравнения = " + (-b - Math.sqrt(discriminant(a, b, c))) / 2 * a);
            }
        } else {
            System.out.println("вы ввели некорректные данные");
        }
    }

}
