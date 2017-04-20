package java1702.javase.generic;

import java.util.Date;

/**
 * Created by 刘晋勇 on.
 * 2017/4/13  8:35.
 */
public class Test<T> {
    // generic 通用的\ [dʒɪ'nerɪk] 泛型 泛化的类型
    // general 一般\ ['dʒen\(ə\)r\(ə\)l]

    public static void main(String[] args) {
        Test test =new Test();

        System.out.println(test.concat(1,2));
        System.out.println(test.concat(1.23,2.34));
        System.out.println(test.concat(true,false));

    }

    public String concat(T x, T y) {
        return String.valueOf(x).concat(String.valueOf(y));
    }
}
