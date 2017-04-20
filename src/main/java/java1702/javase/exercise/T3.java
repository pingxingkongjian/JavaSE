package java1702.javase.exercise;

/**
 * Created by HP on 2017/3/18.
 */
public class T3 {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,2,3);
        System.out.println(triangle.areaTriangle());
        System.out.println(triangle.pTriangle());
    }
}

class Triangle {
    int a ;
    int b ;
    int c ;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int areaTriangle() {
        return (a + b + c ) / 2*  ((a + b + c ) / 2 - a) * ((a + b + c ) / 2 -  b) * ((a + b + c ) / 2 - c);
    }
    public  int pTriangle() {
        return a + b + c ;
    }
}