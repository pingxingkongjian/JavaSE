package java1702.javase.generic;

import java.util.Vector;

/**
 * Created by 刘晋勇 on.
 * 2017/4/13  10:00.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector =new Vector<>();

        vector.add("a");
        vector.add("123");
        vector.add("true");
        vector.add("hello..");

        String s = vector.get(3);
        System.out.println(s);
    }
}
