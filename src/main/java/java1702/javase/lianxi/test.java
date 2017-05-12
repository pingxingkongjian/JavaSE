package java1702.javase.lianxi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ${刘晋勇}
 * on 2017/5/12.
 */
public class Test {
    private static final String IMAGE_URL = "http://tankr.net/s/medium/8EVP.jpg";
    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try(
                    InputStream inputStream = url.openStream();
                    OutputStream outputStream = new FileOutputStream("text.png")

                    ) {
                int i;
                while ((i = inputStream.read()) != -1)
                    outputStream.write(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
