package com.solidprinciple;


class Rectangle {

    protected int width;
    protected int length;

    public Rectangle() {}

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}

class Square extends Rectangle {

    public Square(int size) {
        length = width = size;
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }
}

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4);
        System.out.println("area of rectangle = " + r.getArea());

        Rectangle rs = new Square(5);
        System.out.println("area of Square  =" + rs.getArea());
    }
}

