package com.dmdev.week4.practics;

public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow((point.getX() - this.x), 2) + Math.pow((point.getY() - this.y), 2));
    }
}
