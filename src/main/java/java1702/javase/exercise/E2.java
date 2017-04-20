package java1702.javase.exercise;

/**
 * Created by HP on 2017/3/14.
 */
//[100, 200]素数。
//素数：只能被1和它本身整除的正整数
public class E2 {
    public static void main(String[] args) {
        for (int i = 100; i <201 ; i++) {
            boolean b = true;  //b: 能否整除 i-> i是否是素数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    b = false;
                }
            }
            if (b) {
                System.out.println(i);
            }
        }
    }
}



