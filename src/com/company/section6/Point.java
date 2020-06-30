package com.company.section6;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(new Point());
    }

    public double distance(Point destination) {
        return distance(destination.x, destination.y);
    }

    public double distance(int dX, int dY) {
        return Math.sqrt(Math.pow(dX - x, 2d) + Math.pow(dY - y, 2d));
    }
}
