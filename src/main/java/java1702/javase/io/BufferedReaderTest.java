package java1702.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ${刘晋勇}
 * on 2017/4/21.
 */
public class BufferedReaderTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(""))){
                String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
