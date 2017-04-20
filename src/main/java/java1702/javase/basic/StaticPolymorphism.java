package java1702.javase.basic;

/**
 * Created by HP on 2017/3/17.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.add(1d, 2));
    }
}

class Calculator {
    public int add(int x, int y) {
        return x + y;
    }


    public double add(double x, double y) {
        return x + y;
    }

    public int add(int x, int y, int z) {
        return x + y + z;
    }

    public double add(int x, double y) {
        return 1d;
    }

}
