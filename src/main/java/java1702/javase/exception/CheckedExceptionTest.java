package java1702.javase.exception;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 * Created by 刘晋勇 on.
 * 2017/4/18  9:12.
 */
public class CheckedExceptionTest {

    private static void method() throws FileNotFoundException {
        System.out.println("test...");

    }
    public static void main(String[] args) {
        //extract method Ctrl + Alt + M
        System.out.println("input a file name:");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("build.gradle","r");
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
            System.out.println("file not found ");
    }
}
