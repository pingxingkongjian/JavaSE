package java1702.javase.io;

import java.io.*;

/**
 * Created by ${刘晋勇}
 * on 2017/4/21.
 */
public class BufferedTest {
    public static void main(String[] args) {
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(""));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(""))
        ) {
            int i;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
