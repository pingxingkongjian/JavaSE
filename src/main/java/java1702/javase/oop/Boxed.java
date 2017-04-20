package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/27  13:41.
 */
public class Boxed {// 封装类 装箱类
    public static void main(String[] args) {
//        int i = 0;
//        double d = 1.2d;

        Integer i = new Integer(0);
        Double d = new Double(1.2d);

        /*
        java.lang
            boolean - Boolean
            byte - Byte
            char - Character*
            short - Short
            int - Integer*
            long - Long
            float - Float
            double - Double
         */

        System.out.println(i);
        System.out.println(d);
    }

}
