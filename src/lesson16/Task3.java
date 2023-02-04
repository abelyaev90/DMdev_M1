package lesson16;

/*3. Имеется целое число. Это число - сумма денег в рублях.
   Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля").*/

public class Task3 {
    public static void main(String[] args) {
        // 1, 21, 31 рубль
        // 2- 4 рубля
        //0, 5-9, 11-19 рублей

        int number = 21;
        if (number % 10 == 0 || (number % 10 >= 5 && number % 10 <= 9) || (number % 100 >= 11 && number % 100 <= 19)) {
            System.out.printf("%d рублей", number);
        } else if (number % 10 >= 2 && number % 10 <= 4) {
            System.out.printf("%d рубля", number);
        } else if (number % 10 == 1) {
            System.out.printf("%d рубль", number);
        }
    }
}
