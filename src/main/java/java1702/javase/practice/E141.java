package java1702.javase.practice;

/**
 * Created by ${刘晋勇}
 * on 2017/4/22.
 */
public class E141 {
    public static void main(String[] args) {
        char[] chars =  {'a','b','c'};

        try {
            System.out.println(chars[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
