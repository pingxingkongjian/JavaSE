package java1702.javase.practice;

/**
 * Created by 刘晋勇 on.
 * 2017/4/15  8:55.
 */
public class E117 {
    public static void main(String[] args) {
        String str = "hello world";
        int[] sum = new int[52];
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90)//A~Z
                sum[c - 65]++;
            else if (c >= 97 && c <= 122)//a~z
                sum[c - 71]++;
            else
                continue;
        }
        for (int i = 0; i < sum.length; i++)
            if (sum[i] > max)
                max = sum[i];
        System.out.println(max);


    }

}


