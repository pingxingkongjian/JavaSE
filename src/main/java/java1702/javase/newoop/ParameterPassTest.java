package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/7  8:56.
 */
public class ParameterPassTest {
    private static void test(int  x) {
        System.out.println("B:" + x);
        x++;
        System.out.println("C:" + x);
    }

    public static void main(String[] args) {
        int i = 1;
        System.out.println("A:" + i);
        test(i);
        System.out.println("D:" + i);
    }
}
