package java1702.javase.basic;

/**
 * Created by 刘晋勇 on.
 * 2017/3/8  20:38.
 */

public class RelationalOperators {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        System.out.println(x != y);

        String s1 = "hi";
        String s2 = new String("hi");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2); // ?

        System.out.println(x <= y);
    }
}
