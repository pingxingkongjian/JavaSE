package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/5  14:42.
 */
public class OverloadTest {

    public void method() {
        System.out.println("method...");
    }

    public OverloadTest() {
        System.out.println("构造方法与类同名，所以它们之间都是重载");
    }

    public int method(int i) {

        System.out.println("");
        return i;
    }

    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();
        overloadTest.method(1);
        overloadTest.method();


    }
}
