package java1702.javase.practice;

/**
 * Created by 刘晋勇 on.
 * 2017/4/4  19:26.
 */
                        //数组练习

public class Test1 {
    public static void main(String[] args) {
        double[] doubles = new double[8];
        doubles[0] = 1.1;
        doubles[1] = 1.2;
        doubles[2] = 1.3;
        doubles[3] = 1.4;
        doubles[4] = 1.5;
        doubles[5] = 1.6;
        doubles[6] = 1.7;
        doubles[7] = 1.8;

        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }
        double total = 0;
        for (int i = 0; i < doubles.length; i++) {
            total += doubles[i];
        }
        System.out.println("所有数总和：" + total);
    }

}
