package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/21  15:03.
 */
// class = field + method
public class StaticBlockTest {

    class Test {
        int i;
        double d;
    }

    {

    }

    private int i;
    private boolean b;

    public StaticBlockTest() {
        System.out.println("in constructor...");
    }

    static { // 初始化工作
        // static block 静态块
        System.out.println("static block...");
    }

    public void m() {

    }

    public static void main(String[] args) {
        StaticBlockTest staticBlockTest1 = new StaticBlockTest();
        StaticBlockTest staticBlockTest2 = new StaticBlockTest();
    }
}
