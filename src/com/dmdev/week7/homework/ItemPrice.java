package com.dmdev.week7.homework;

public class ItemPrice {

    private final String id;
    private final String price;

    public ItemPrice(String line) {
        String[] split = line.split(",");
        id = split[0];
        price = split[1];
    }

    public String getId() {
        return id;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ItemPrice{" +
               "id=" + id +
               ", price=" + price +
               '}';
    }
}
