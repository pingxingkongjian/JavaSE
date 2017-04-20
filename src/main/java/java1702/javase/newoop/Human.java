package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/1  8:59.
 */
public class Human {
    private String name;
    private double height;
    private double weight;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Human(String name, double height, double weight, char gender, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {

    }
    public void run() {

    }
    public void study() {

    }
    public int sleep(boolean isPalyGame) {
        return isPalyGame? 1 : 8;

        //三目运算符（三元运算符）
        //可以理解为条件 ? 结果1 : 结果2 ,里面的？号是格式要求。也可以理解为是不是条件成立，条件成立为结果1否则为结果2
    }
    public void work() {

    }
    public void dance() {

    }

    public static void main(String[] args) {
        Human human = new Human("Tom",1.75,80, '男',18);
        System.out.println(human.name);
        System.out.println(human.height);
        System.out.println(human.weight);
        System.out.println("----------------------");
        human.setAge(100);
        System.out.println(human.getAge());

        System.out.println(human.gender);
        System.out.println(human.age);
    }

}
