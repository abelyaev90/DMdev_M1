package houmeTask;

/*Задание 1

В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

Протестировать функцию в main.*/

public class Task1 {
    public static void main(String[] args) {
        int minutes = 53;
        whatQuarterOfAnHour(minutes);
    }

    public static void whatQuarterOfAnHour(int minutes) {
        if (minutes <=15 && minutes >=0) {
            System.out.println(minutes + " находится в первой четверти часа");
        }
        else if (minutes >=15 && minutes <30) {
            System.out.println(minutes + " находится во второй четверти часа");
        }
        else if (minutes >=30 && minutes < 45) {
            System.out.println(minutes + " находится в третьей четверти часа");
        }
        else if (minutes >=45 && minutes < 60 ) {
            System.out.println(minutes + " находится в четвертой четверти часа");
        } else {
            System.out.println(minutes + " отсутствует в диапазоне от 0 до 60 минут");
        }
    }
}
