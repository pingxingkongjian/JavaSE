package java1702.javase.basic;

/**
 * Created by  on 2017/3/8.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);

        // & && ab都为 true，结果为 true
        // | || ab都为 false，结果为 false
        // ^ ab不相同，结果为 true (异)
        // ! 取反 单目运算符HP

        int x = 2;
        int y = 1;

        boolean z = (x < y) && (y++ < x);

        System.out.println(z);
        System.out.println(y);
    }
}
