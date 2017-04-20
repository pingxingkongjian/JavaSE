package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/6  10:44.
 */
public final class FinalTest {
    private final int i;

    public FinalTest(int i) {
        this.i = i;
    }

    public FinalTest() {
        i = 1;
    }

    public final void m() {
//        i = 1;
    }

    public static void main(String[] args) {
        FinalTest finalTest = new FinalTest();
    }
}

//class SubFinalTest extends FinalTest {
//    @Override
//    public void m() {
//        super.m();
//    }
//}
