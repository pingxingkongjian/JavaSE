package java1702.javase.oop;

import javax.sound.midi.Soundbank;

/**
 * Created by 刘晋勇 on.
 * 2017/3/27  13:59.
 */
public class CastTest {
    public static void main(String[] args) {
        //1.
        int x = 1;
        //a.
        Integer integer = new Integer(x);
        String s1 = integer.toString();
        System.out.println(s1);

        //b.
        String s2 = String.valueOf(x);
        System.out.println(s2);

        //c.
        String s3 = "" + x;
        System.out.println(s3);


        //2.
        String string = "123";

        //a.
        int y1 = Integer.valueOf(string);
        System.out.println(y1);

        //b.
        int y2 = Integer.parseInt(string);
        System.out.println(y2);
    }
}
