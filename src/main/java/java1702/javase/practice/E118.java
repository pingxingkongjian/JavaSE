package java1702.javase.practice;

import java.util.Arrays;

/**
 * Created by 刘晋勇 on.
 * 2017/4/15  9:24.
 */
public class E118 {
    public static void main(String[] args) {
        String s = "123,45,25,85";

        String[] s1 = s.split(",");

        int[] a = new int[s1.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s1[i]);

        }

        Arrays.sort(a);
        for (int i1 : a) {
            System.out.println(i1 + "");
        }
    }
}
