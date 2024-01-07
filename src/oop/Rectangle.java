package oop;

public class Rectangle {

    int width;
    int height;

    void calculateArea() {
        int area = width * height;
        System.out.println("area is "+area);
    }

    void calculatePerimeter() {
        int perimeter = (width + height) * 2;
        System.out.println("perimeter is " + perimeter);
    }

    void isSquare() {
        if (width == height) {
            System.out.println("this is square");
        } else {
            System.out.println("this is not square");
        }
    }


}
