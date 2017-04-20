package java1702.javase.examination;

import java.util.Scanner;

/**
 * Created by 刘晋勇 on.
 * 2017/4/1  14:08.
 */
//从键盘上输入一个字符串，利用字符串类的方法将大写字母转变为小写字母，
// 小写字母转变为大写字母，再将前后字符对换,然后输出最后结果。
public class E2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.next();
        String s1 = s.toLowerCase();
        System.out.println("小写："+s1);
        String s2 = s1.toUpperCase();
        System.out.println("大写："+s2);
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length/2; i++) {
            int oldindex = i;
            int newindex = c.length-1-i;
            char temp = c[oldindex];
            c[oldindex] = c[newindex];
            c[newindex] = temp;
        }
        System.out.println("前后字符对换：" );
        System.out.println(c);

    }

}
