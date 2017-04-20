package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/27  14:50.
 */
public class Boxing {
    public static void main(String[] args) {
        Long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i; // sum = sum + i;
        }
        System.out.println("time: " + (System.currentTimeMillis() - start)/1000 + " s");
        System.out.println("sum: " + sum);
    }
}
