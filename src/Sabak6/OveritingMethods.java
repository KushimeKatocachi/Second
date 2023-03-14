package Sabak6;

public class OveritingMethods extends Shape {

    @Override
    double calculateArea2() {
        return 5*6;
    }

    int length;
    int width;
    int sides;

    public OveritingMethods(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public OveritingMethods() {
    }

    public int calculatePerimeter() {
        return 2 * (length) + 2 * (width);
    }

    public int calculatePerimeter(int length, int width) {
        return 2 * (length) + 2 * (width);
    }
}