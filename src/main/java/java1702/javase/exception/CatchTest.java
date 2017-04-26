package java1702.javase.exception;

/**
 * Created by 刘晋勇 on.
 * 2017/4/17  9:58.
 */
public class    CatchTest {
    public static void main(String[] args) {
        try {
            System.out.println(1/0);
            System.out.println("hello".charAt(5));
            System.out.println(new int[]{1,2,3}[-1]);
        } catch (Exception e) {
            e.printStackTrace();

//            System.err.println("算数异常");
        }finally {
            System.out.println("finally...");
        }

        System.out.println("test....");
    }
}
