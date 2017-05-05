package java1702.javase.reflect.demo.c;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by ${刘晋勇}
 * on 2017/5/5.
 */
public class PorpertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/main/java/java1702/javase/reflect/demo/c/config.properties"));
        System.out.println(properties.getProperty("key"));
        System.out.println(properties.getProperty("k"));
    }
}
