package com.dmdev.week7.homework;

public class ItemName {

    private final String id;
    private final String name;
    private final String description;

    public ItemName(String line) {
        String[] split = line.split(",");
        id = split[0];
        name = split[1];
        description = split[2];
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "ItemsName{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               '}';
    }
}
