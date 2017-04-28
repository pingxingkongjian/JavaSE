package java1702.javase.practice;

import java.util.Arrays;

/**
 * Created by 刘晋勇 on.
 * 2017/4/15  9:24.
 */
// 拆分字符串，字符串中含有逗号和数字，对数字排序并输出
//        例如：String s0=“123,45,25,85”;
//        输出：25 45 85 123
//        sort
public class E118 {
    public static void main(String[] args) {
        String s = "123,45,25,85";

        String[] strings = s.split(",");
        int[] ints = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(ints);
        for (int anInt : ints) {
            System.out.println(anInt + "");
        }
    }
}
