package com.dmdev.week4.practics;

public class Rectangle {
    private final Point upperLeftCorner;
    private final Point bottomRightCorner;

    public Rectangle(Point upperLeftCorner, Point bottomRightCorner) {
        this.upperLeftCorner = upperLeftCorner;
        this.bottomRightCorner = bottomRightCorner;
    }

    public Point getUpperLeftCorner() {
        return upperLeftCorner;
    }

    public Point getBottomRightCorner() {
        return bottomRightCorner;
    }

    public double areaRectangle(Rectangle rectangle) {
        return Math.abs((rectangle.getUpperLeftCorner().getX() - rectangle.getBottomRightCorner().getX()) *
                        (rectangle.getUpperLeftCorner().getY() - rectangle.getBottomRightCorner().getY()));
    }

    public double diagonalLength(Rectangle rectangle) {
        return rectangle.getUpperLeftCorner().distance(rectangle.getBottomRightCorner());
    }
}
