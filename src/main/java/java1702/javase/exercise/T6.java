package java1702.javase.exercise;

/**
 * Created by HP on 2017/3/18.
 */
public class T6 {
    public static void main(String[] args) {
       Person person = new Person("Tom","男",25);
        System.out.println(person.name);
        System.out.println(person.gender);
        System.out.println(person.age);


    }
}

class Person {

    String name;
    String gender;
    int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}


