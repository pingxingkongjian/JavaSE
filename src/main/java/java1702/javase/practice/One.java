package java1702.javase.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 刘晋勇 on.
 * 2017/4/8  14:19.
 */
public class One {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(Arrays.toString(s.getBytes()));
        byte[] bytes = s.getBytes();
        int s1 = 0;
        for (int i = 0; i < bytes.length; i++) {
            byte aByte = bytes[i];
            s1 = s1 + aByte;
        }
        System.out.println(s1);
    }
}
