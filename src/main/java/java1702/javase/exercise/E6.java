package java1702.javase.exercise;

import java.util.Scanner;

/**
 * Created by HP on 2017/3/17.
 */
//输入两个正整数m和n，求其最大公约数和最小公倍数
public class E6 {
//    public int min( int x, int y) {
//        return (x >= y)? y:x;
//    }
//    public int max(int x, int y) {
//        return (x <= y)? y:x;
//    }
//    public static void main(String[] args) {
//        int n =10;
//        int m =15;
//        java1702.javase.exercise.E6 e6 = new java1702.javase.exercise.E6();
//        int min = e6.min(m ,n);
//        for (int i = n; i <m ; i++) {
//            if (m % i == 0 && n % i ==0) {
//                System.out.println(i);
//                break;
//            }
//        }
//    }


    //控制台输出的做法。。。
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("input m: ");
    int m = scanner.nextInt();
    System.out.println("input n: ");
    int n = scanner.nextInt();

    for (int i = m; i <0 ; i--) {
        if (m % n == 0 && n % i == 0) {
            System.out.println(i);
            break;
        }
    }
    for (int j = m; j <= m * n ; j++) {
        if (j % m == 0 && j % n == 0) {
            System.out.println(j);
            break;
        }
    }
}
}
