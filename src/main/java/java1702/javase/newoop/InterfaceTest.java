package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/6  14:59.
 */
public interface  InterfaceTest extends A, B, C, D{ //接口本身可以继承 extends 多个父接口
    int ZERO = 0;
    void method();
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}


class InterfaceTestImpl implements InterfaceTest, A, B, C, D {

    @Override
    public void method() {
        System.out.println("method...");
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {
        System.out.println("d....");
    }
}

class T {
    public static void main(String[] args) {
        InterfaceTestImpl interfaceTest = new InterfaceTestImpl();
        interfaceTest.method();
        interfaceTest.d();
        System.out.println(InterfaceTest.ZERO);
    }
}
