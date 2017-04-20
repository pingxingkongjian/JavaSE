package java1702.javase.collection;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by 刘晋勇 on.
 * 2017/4/11  17:02.
 */
public class E1 {

    public static void main(String[] args) {

//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("tom", 18, 'M'));
//        students.add(new Student("jerry", 20, 'F'));

        HashSet<Student> students = new HashSet<>();
        students.add(new Student("tom", 18, 'M'));
        students.add(new Student("jerry", 20, 'F'));

        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
            System.out.println(student.getGender());
        }
    }
}


class Student {

    private String name;
    private int age;
    private char gender;

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}