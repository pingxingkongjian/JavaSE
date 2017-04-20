package java1702.javase.basic;

/**
 * Created by 刘晋勇 on.
 * 2017/3/16  14:48.
 */
public class Father {

    int money;

    public void coding() {         //super class base class 父类 超类
        System.out.println("father is coding...");
    }

}

class Son extends Father {   //sub class 子类

}

class ExtendsTest {
    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.money);
        father.coding();

        Son son = new Son();
        System.out.println(son.money);
        son.coding();
    }
}