package java1702.javase.oop;

/**
 * Created by HP on 2017/3/16.
 */
public class Oop4 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println(circle.getCircle());
    }
}

class Circle {
    private static final double pi = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public double getCircle() {
        return 3.14* radius *radius;
    }
}
