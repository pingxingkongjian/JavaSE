package java1702.javase.io;

import java.io.*;

/**
 * Created by ${刘晋勇}
 * on 2017/4/21.
 */
public class BufferedTest {
    public static void main(String[] args) {
        try (
                InputStream inputStream = new FileInputStream("");
                OutputStream out = new FileOutputStream("");
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
