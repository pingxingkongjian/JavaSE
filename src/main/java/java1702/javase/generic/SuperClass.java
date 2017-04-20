package java1702.javase.generic;

/**
 * Created by 刘晋勇 on.
 * 2017/4/13  11:49.
 */
public class SuperClass<T> {

    public void method(T t) {
        System.out.println("method...");
    }
}

class SubClass extends SuperClass {

    public static void main(String[] args) {
        SuperClass<String> stringSuperClass = new SuperClass<>();
        stringSuperClass.method("hello..");
    }
}
