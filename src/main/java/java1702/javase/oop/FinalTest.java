package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/26  14:51.
 */
public class FinalTest {
    // final 最后的 最终的 终态

    private final int i;

    private  double d = 1d;

    public FinalTest(int i, double d) {
        this.i = i;
        this.d = d;
    }

    public FinalTest() {
        i = 0;
    }

    public final void method() {

    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
        System.out.println(finalTest.i);
//        finalTest.i = 1;
    }
}

/*
class SubFinalTest extends FinalTest {
    @Override
    public void method() {
        super.method();
        // ...
    }
}
*/

