package java1702.javase.collection;

/**
 * Created by 刘晋勇 on.
 * 2017/3/29  10:54.
 */
public class StringVsStringBufferTest {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // alphabet 字母\ ['ælfəbet]

    public static void main(String[] args) {
//        String s = "";

        StringBuffer stringBuffer = new StringBuffer("");

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
//            s += ALPHABET;

            stringBuffer.append(ALPHABET);
        }

        System.out.println("time" + (System.currentTimeMillis() - start));
//        System.out.println(s.length());
        System.out.println(stringBuffer.length());
    }
}
