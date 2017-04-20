package java1702.javase.exercise;

/**
 * Created by 刘晋勇 on.
 * 2017/3/25  10:11.
 */
public class Animal3 {
    String name;
    double weight;
    boolean hair;

    public Animal3(String name, double weight, boolean hair) {
        this.name = name;
        this.weight = weight;
        this.hair = hair;
    }

    public void eat() {
        System.out.println("cat is eating");
    }
    public void bellow() {
        System.out.println("cat is bellowing");
    }
    public void run() {
        System.out.println("cat is runing");
    }

    public static void main(String[] args) {

    }
}
class Cat3 {
    public Cat3() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {

    }

}

