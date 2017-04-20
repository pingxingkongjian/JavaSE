package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/23  9:23.
 */
public interface InterfaceTest {
    int ONE = 1;

    void m();


    void a();
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

class InterfaceTestImpl implements InterfaceTest, B, C, D {
 //implements 翻译：被实现

    @Override
    public void m() {

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

    }

    public static void main(String[] args) {
        System.out.println(ONE);
    }
}
