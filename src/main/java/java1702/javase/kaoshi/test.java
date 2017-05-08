package java1702.javase.kaoshi;

import java1702.javase.house.Data;

import java.util.Date;

/**
 * Created by ${刘晋勇}
 * on 2017/5/7.
 */
public class Test<T> {
    public static void main(String[] args) {
//        System.out.println(concat(1,2));
//        System.out.println(concat(1.3,4.5));
        Test test = new Test();
        System.out.println(test.concat(1,2));
        System.out.println(test.concat(1.2,1.5));
        System.out.println(test.concat(new Date(),new Date()));
        System.out.println(test.concat(new Test<>(),new Test<>()));    }

    private String concat(T x, T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }

//    private static String concat(int x, int y) {
//        return String.valueOf(x).concat(String.valueOf(y));
//    }
//
//    private static String concat(double x, double y) {
//        return String.valueOf(x).concat(String.valueOf(y));
//    }
}
