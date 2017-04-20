package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/6  9:07.
 */
public abstract class AbstractTest {
    private int i;

    public AbstractTest(int i) {
        this.i = i;
    }

    public abstract void method(String s, boolean b);

    public abstract void method(String s);

    public static void main(String[] args) {
        SubAbstractTest subAbstractTest = new SubAbstractTest(1);
        subAbstractTest.method("5");

    }
}

class SubAbstractTest extends AbstractTest {

    public SubAbstractTest(int i) {
        super(i);
    }

    @Override
    public void method(String s, boolean b) {

    }

    @Override
    public void method(String s) {
        System.out.println("什么鬼");
    }
}
