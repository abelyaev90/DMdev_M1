package com.dmdev.week5.practics.generics.task1.homework.collections.part2;

import com.dmdev.week5.practics.generics.task1.homework.collections.part1.Chat;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 2
 * Дан список чатов с предыдущего задания, только вместо поля “количество пользователей” будет список объектов типа
 * Пользователь, который имеет 3 поля: id (целочисленный идентификатор), имя и возраст.
 * <p>
 * Задача:
 * <p>
 * - Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
 * <p>
 * - С помощью итератора посчитать средний возраст всех оставшихся пользователей.
 */

public class Task2 {

    public static void main(String[] args) {

        List<Chat> listChat = new ArrayList<>();
        List<User> listUser = new ArrayList<>();
        List<User> listUser2 = new ArrayList<>();
        List<User> listUser3 = new ArrayList<>();

        listUser.add(new User(1, "Tom", 12));
        listUser.add(new User(2, "Pol", 19));
        listUser.add(new User(3, "Robin", 17));

        listUser2.add(new User(1, "Fred", 19));
        listUser2.add(new User(2, "Kate", 21));
        listUser2.add(new User(3, "Tom", 26));

        listUser3.add(new User(1, "Tomas", 40));
        listUser3.add(new User(2, "Kate", 14));
        listUser3.add(new User(3, "Rick", 35));

        listChat.add(new Chat("doctorChat", listUser));
        listChat.add(new Chat("firefighterChat", listUser));
        listChat.add(new Chat("teacherChat", listUser2));
        listChat.add(new Chat("teacherChat", listUser3));
        listChat.add(new Chat("teacherChat", listUser2));
        listChat.add(new Chat("builderChat", listUser));
        listChat.add(new Chat("engineerChat", listUser3));


        System.out.println("Исходный список чатов: ");
        printChat(listChat);
        List<User> resultUserList = sortChatForAge(listChat);
        System.out.println("Список пользователей всех чатов, возраст которых больше 18 лет");
        printUserChat(resultUserList);

        double averageAgeUser = findAverageAgeUser(resultUserList);

        System.out.println("Средний возраст юзеров составил: " + averageAgeUser);

    }

    private static double findAverageAgeUser(List<User> resultUserList) {
        Iterator<User> userIterator = resultUserList.iterator();
        double sumAge = 0;
        int countUser = 0;
        while (userIterator.hasNext()) {
            User nextUser = userIterator.next();
            sumAge += nextUser.getAge();
            countUser++;
        }
        return sumAge / countUser;
    }


    private static List<User> sortChatForAge(List<Chat> listChat) {
        List<User> changeListUserForAge = new ArrayList<>();
        Iterator<Chat> chatIterator = listChat.iterator();
        while (chatIterator.hasNext()) {
            Chat chat = chatIterator.next();
            List<User> chatListUser = chat.getListUser();
            Iterator<User> userIterator = chatListUser.iterator();
            while (userIterator.hasNext()) {
                if (userIterator.next().getAge() < 18) {
                    userIterator.remove();
                }
            }
        }
        for (Chat chat : listChat) {

            List<User> listUser = chat.getListUser();
            changeListUserForAge.addAll(listUser);
        }
        return changeListUserForAge;
    }

    private static void printChat(List<Chat> listChat) {
        for (Chat chat : listChat) {
            System.out.println(chat.getName() + " список юзеров: " + chat.getListUser());
        }
        System.out.println("***********");
    }

    private static void printUserChat(List<User> listUser) {
        for (User user : listUser) {
            System.out.println(user);
        }
        System.out.println("***********");
    }
}
