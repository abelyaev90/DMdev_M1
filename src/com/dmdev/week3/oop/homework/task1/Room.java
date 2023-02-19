package com.dmdev.week3.oop.homework.task1;

public class Room {

    private Boolean checkpoint;

    public Room(Boolean checkpoint) {
        this.checkpoint = checkpoint;
    }

    public void print() {
        System.out.println("Комната проходная? -> " + checkpoint);
    }

    public Boolean getCheckpoint() {

        return checkpoint;
    }
}
