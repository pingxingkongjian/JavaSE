package java1702.javase.practice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by ${刘晋勇}
 * on 2017/4/27.
 */
//编写一个程序实现以下功能

public class E144 {
    public static void main(String[] args) {
        try (RandomAccessFile raf = new RandomAccessFile("a.txt","rw")){
            for (int i = 0; i <5000; i++) {
                int r = (int)(Math.random()*9997)+2;
                raf.writeInt(r);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
