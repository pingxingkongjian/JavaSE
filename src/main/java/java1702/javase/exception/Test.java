package java1702.javase.exception;

/**
 * Created by 刘晋勇 on.
 * 2017/4/17  9:08.
 */
public class Test {
    public static void main(String[] args) {

        try {
            System.out.println("hello".charAt(4));//异常 java.lang.StringIndexOutOfBoundsException

            System.out.println(new int[]{1, 2, 3}[-1]);

            System.out.println(Integer.valueOf("123"));

            System.out.println(1 / 1);

            String s = "hi";

            System.out.println(s.toUpperCase());

        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("test...");
    }
}
