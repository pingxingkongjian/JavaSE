package java1702.javase.io;

import java.io.File;

/**
 * Created by ${刘晋勇}
 * on 2017/4/21.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("build.gradle");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}
