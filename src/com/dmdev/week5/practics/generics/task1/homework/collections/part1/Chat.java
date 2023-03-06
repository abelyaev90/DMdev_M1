package com.dmdev.week5.practics.generics.task1.homework.collections.part1;

import com.dmdev.week5.practics.generics.task1.homework.collections.part2.User;

import java.util.List;

public class Chat {

    private final String name;
    private  int numberOfUsers;

    private  List<User> listUser;

    public Chat(String name, int numberOfUsers) {
        this.name = name;
        this.numberOfUsers = numberOfUsers;
    }

    public Chat(String name, List<User> listUser) {
        this.name = name;
        this.listUser = listUser;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfUsers() {
        return numberOfUsers;
    }

    public List<User> getListUser() {
        return listUser;
    }

    @Override
    public String toString() {
        return "Chat{" +
               "name='" + name + '\'' +
               ", numberOfUsers=" + numberOfUsers +
               '}';
    }
}
