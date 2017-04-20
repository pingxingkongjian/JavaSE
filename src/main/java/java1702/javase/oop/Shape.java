package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/21  10:05.
 */
// shape 形状\ [ʃeɪp] 三角形 四边形 正方形 矩形 圆型 ...
//抽象类对其所有的子类
public abstract class Shape {

    public abstract double getPerimeter();  //周长

    public abstract double getArea();       //面积


}


class CircleTest extends Shape {
    //    private double x;
//    private double y;
    private double pi = 3.14;
    private double radius;  // 圆的半径

    public CircleTest( double radius) {
        this.radius = radius;

    }



    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }


    @Override
    public double getArea() {
        return pi * Math.pow(radius, 2);
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            this.a = a;
            this.b = b;
            this.c = c;

        } else {
            System.out.println("error");
            System.exit(0);
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c ) / 2;
        return s * Math.sqrt((s - a) * (s - b) * (s - c)); // 海伦公式
    }

}

class Square extends Shape {

    private double a;
    private double b;
    private double c;
    private double d;

    public Square(double a, double b, double c, double d) {

        if ((a + b + c > d)&&(a + b + d > c)&&(a + c + d > b)&&(b + c + d > a)) {

            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        } else {
            System.out.println("error");
        }
    }

    @Override
    public double getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public double getArea() {
        return 0;
    }
}

