package java1702.javase.practice;

/**
 * Created by ${刘晋勇}
 * on 2017/4/22.
 */
public class E142 {
    public static void main(String[] args) {
        String s = null;

        try {
            s.equals("123");
        } catch (NullPointerException e) {
            System.out.println("需要创建新对象");
        }
    }
}
