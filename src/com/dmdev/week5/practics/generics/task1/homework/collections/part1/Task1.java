package com.dmdev.week5.practics.generics.task1.homework.collections.part1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * Задание 1
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * <p>
 * Задача:
 * <p>
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * <p>
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
 * <p>
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */

public class Task1 {

    public static void main(String[] args) {

        List<Chat> listChat = new ArrayList<>();

        listChat.add(new Chat("doctorChat", 900));
        listChat.add(new Chat("firefighterChat", 200));
        listChat.add(new Chat("teacherChat", 1100));
        listChat.add(new Chat("teacherChat", 1001));
        listChat.add(new Chat("teacherChat", 1050));
        listChat.add(new Chat("builderChat", 760));
        listChat.add(new Chat("engineerChat", 1050));


        int numberOfUsers = 1000;
        System.out.println("Исходный список чатов: ");
        printChat(listChat);
        printChatSortDefault(listChat);

        Iterator<Chat> chatIterator = listChat.iterator();

        printChangeListChat(listChat, chatIterator, numberOfUsers);
        printChatSort(listChat);
    }

    private static void printChatSort(List<Chat> listChat) {
        listChat.sort(Comparator.comparing(Chat::getNumberOfUsers).thenComparing(Chat::getName));
        System.out.println("Отсортированный список чатов: ");
        printChat(listChat);
    }

    private static void printChatSortDefault(List<Chat> listChat) {
        listChat.sort(Comparator.comparing(Chat::getName));
        System.out.println("Отсортированный список чатов по умолчанию: ");
        printChat(listChat);
    }

    private static void printChangeListChat(List<Chat> listChat, Iterator<Chat> chatIterator, int numberOfUsers) {

        while (chatIterator.hasNext()) {
            if (chatIterator.next().getNumberOfUsers() < numberOfUsers) {
                chatIterator.remove();
            }
        }

        System.out.println("Список чатов с количеством пользователей более " + numberOfUsers + " :");
        printChat(listChat);
    }

    private static void printChat(List<Chat> listChat) {
        for (Chat chat : listChat) {
            System.out.println(chat);
        }
        System.out.println("***********");
    }
}
