package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/5  14:01.
 */
public class SuperClass {
    int i;

    public SuperClass(int i) {
        this.i = i;
        System.out.println("in super class constructor...");
    }

    public void method() {
        System.out.println("method...");
    }
}

class SubClass extends SuperClass {

    private boolean b;
    public SubClass(int i) {
        super(i);
        this.b = b;
        System.out.println("in sub class constructor...");
    }

    public boolean getB() {
        return b;
    }

    @Override
    public void method() {
        System.out.println("多态重写  子类重写父类的方法 快捷键 ctrl + o ");
    }
}

class Test {
    public static void main(String[] args) {
        SuperClass superClass = new SubClass(1);
        System.out.println(superClass.i);
        superClass.method();

        SubClass subClass = new SubClass(2);
        System.out.println(subClass.i);
        System.out.println(subClass.getB());
        subClass.method();

    }
}
