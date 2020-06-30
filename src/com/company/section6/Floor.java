package com.company.section6;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width >= 0 ? width : 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length >=0 ? length : 0;
    }

    public double getArea() {
        return width * length;
    }
}
