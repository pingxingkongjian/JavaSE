package java1702.javase.lianxi;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ${刘晋勇}
 * on 2017/5/9.
 */
public class InputStreamTest {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("test");
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
