package java1702.javase.practice;

import java.io.File;

/**
 * Created by ${刘晋勇}
 * on 2017/4/22.
 */
public class E143 {
    public static void main(String[] args) {
        File file = new File("1.txt");
        System.out.println(file.canRead());
    }
}
