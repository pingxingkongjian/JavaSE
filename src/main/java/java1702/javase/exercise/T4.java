package java1702.javase.exercise;

/**
 * Created by HP on 2017/3/18.
 */
public class T4 {
    public static void main(String[] args) {
        Degrees degrees = new Degrees(3);
        System.out.println(degrees.fDegrees());
    }
}

class Degrees {
    int c;

    public Degrees(int c) {
        this.c = c;
    }

    public int fDegrees() {
        return (9 / 5) * c + 32;
    }
}
