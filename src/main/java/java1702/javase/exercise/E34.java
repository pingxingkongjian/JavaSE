package java1702.javase.exercise;

import java.util.Date;
import java.util.Random;

/**
 * Created by 刘晋勇 on.
 * 2017/3/20  16:19.
 */
//随机生成[1-20]数10000次;
//java.lang.Math  java.util.Random
public class E34 {
    public static void main(String[] args) {
        Random random = new Random();

        long start = System.nanoTime(); //返回系统当前时间毫微秒数
        //
        for (int i = 0; i < 10000; i++) {
            int r = (int) (Math.random() * 20) + 1;
//            int r =random.nextInt(20) +1;
            System.out.println(r);
        }
        long end = System.nanoTime();

        System.out.println(end - start);

        System.out.println(System.currentTimeMillis());
        System.out.println((150000000000000L - System.currentTimeMillis()));

        System.out.println(new Date(1500000000000L));
    }
}
