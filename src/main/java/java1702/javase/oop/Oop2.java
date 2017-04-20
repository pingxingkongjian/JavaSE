package java1702.javase.oop;

/**
 * Created by HP on 2017/3/16.
 */
public class Oop2 {
    public static void main(String[] args) {
        Cube cube = new Cube(1d,2d,3d);
        System.out.println(cube.getVolume());
    }
}


class Cube {
    double lenght;
    double width;
    double height;


    public Cube(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }



    public double getVolume() {
        return lenght * width * height;

    }



}