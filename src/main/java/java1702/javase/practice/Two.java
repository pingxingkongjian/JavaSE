package java1702.javase.practice;

/**
 * Created by 刘晋勇 on.
 * 2017/4/8  14:33.
 */
public class Two {
    public static void main(String[] args) {
        int a[] ={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                continue;
            }
            System.out.println(a[i]);
        }
    }
}
