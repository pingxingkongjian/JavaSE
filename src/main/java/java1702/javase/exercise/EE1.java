package java1702.javase.exercise;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by 刘晋勇 on.
 * 2017/3/21  16:44.
 */
public class EE1 {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();

        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        for (int i = 0; i <=10000 ; i++) {
            if (x == i) {
                System.out.println("对了");
            }
        }
    }
}

