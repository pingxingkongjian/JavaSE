package java1702.javase.kaoshi;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by ${刘晋勇}
 * on 2017/5/6.
 */
class Test165 {
    private static final String IMAGE_URL = "https://www.baidu.com/img/bd_logo1.png";
    public static void main(String[] args) throws FileNotFoundException {
        try {
            URL url = new URL(IMAGE_URL);
            try {
                try (InputStream inputStream = url.openStream();
                     OutputStream outputStream = new FileOutputStream("test5.png")) {
                    int i;
                    if ((i = inputStream.read()) != -1) {
                        outputStream.write(i);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
