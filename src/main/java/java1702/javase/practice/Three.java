package java1702.javase.practice;

import java.util.Arrays;

/**
 * Created by 刘晋勇 on.
 * 2017/4/8  14:38.
 */
public class Three {
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(Arrays.toString(s.split("")));

        StringBuffer stringBuffer =new StringBuffer("Hello World");
        stringBuffer.setCharAt(6,'w');
        stringBuffer.setCharAt(1,'E');
        stringBuffer.setCharAt(2,'L');
        stringBuffer.setCharAt(3,'L');
        stringBuffer.setCharAt(4,'O');
        System.out.println(stringBuffer);
        String date = "20100110";
        System.out.println(date.substring(0,4) + "年" + date.substring(5,6) + "月" + date.substring(6,8) + "日");
    }
}
