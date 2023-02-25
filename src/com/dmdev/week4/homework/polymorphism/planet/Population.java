package com.dmdev.week4.homework.polymorphism.planet;

public enum Population {
    SMALL("до 1_000_000 жителей"),
    AVERAGE("до 10_000_000 жителей"),
    BIG("до 100_000_000 жителей");

    private final String quantity;

    Population(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }
}
