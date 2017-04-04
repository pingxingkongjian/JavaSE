package java1702.javase.practice;

/**
 * Created by 刘晋勇 on.
 * 2017/4/19  16:30.
 */
public class E1 {
    public static void main(String[] args) {

        for (int j = 1; j < 10; j++) {
            for (int k = 1; k <10; k++) {
                if (j >= k) {

                System.out.print(j + "*" + k + "=" + j*k +"\t");
                }
            }
        System.out.println("---");
        }
    }
}
