package oop;

public class RectangleOopMain {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.width = 7;
        rectangle.height = 7;

        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        rectangle.isSquare();
    }
}
