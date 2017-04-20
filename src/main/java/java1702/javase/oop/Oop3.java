package java1702.javase.oop;

/**
 * Created by HP on 2017/3/16.
 */
public class Oop3 {
    public static void main(String[] args) {
        Mankind mankind = new Mankind();
        mankind.setGender('男');
        System.out.println(mankind.getGender());
        mankind.setHeight(1.75);
        System.out.println(mankind.getHeight());
        mankind.setWeight(60);
        System.out.println(mankind.getWeight());
    }
}

class Mankind {

    private char gender;
    private double height;
    private double weight;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this. weight = weight;
    }
}