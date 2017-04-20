package java1702.javase.practice;

import java.util.Scanner;

/**
 * Created by 刘晋勇 on.
 * 2017/4/15  10:34.
 */
public class E120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入浮点数值：");
        while (sc.hasNext()) {
            double num = sc.nextDouble();
            int i = (int) num;

            System.out.println((num - i) >= 0.5 ? i + 1 : i);
        }
    }
}
