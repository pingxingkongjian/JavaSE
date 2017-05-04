package java1702.javase.reflect;

import java.lang.reflect.Field;

/**
 * Created by ${刘晋勇}
 * on 2017/5/4.
 */
public class AccessibleTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Person person = new Person(18);
        Field age = Class.forName("java1702.javase.reflect.Person").getDeclaredField("age");
        age.setAccessible(true);
        age.set(person,29); //改变age的值
        System.out.println(age.get(person));
//        age.setInt(person,age.getInt(person) + 1);
//        System.out.println(age.getInt(person));

    }
}

class Person {
    private int age;

    public Person(int age) {
        this.age = age;

    }
}
