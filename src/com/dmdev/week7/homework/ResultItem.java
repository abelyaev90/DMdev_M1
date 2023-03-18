package com.dmdev.week7.homework;

public class ResultItem {

    private final String id;
    private final String name;
    private final String price;

    public ResultItem(String id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "ResultItem{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", price='" + price + '\'' +
               '}';
    }
}
