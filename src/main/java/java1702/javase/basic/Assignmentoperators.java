package java1702.javase.basic;

/**
 * Created by ${刘晋勇} on.
 * 2017/3/8 10:07.
 */
public class Assignmentoperators {
    public static void main(String[] args) {
        int i = 0; // Shift + F6
        i += 1; // 等价于 i = i + 1;
        i -= 2;
        i *= 5;
        i /= 4;
        i %= 5;
        System.out.println(i); // 0 1 -1

        boolean b = true;
        b &= false; // b = b & false
        System.out.println(b);

        i &= 1; // Bitwise & i = -1 & 1
        System.out.println(i);

        // 000...1 111...0 111...1
        //                 000...1  000...1

    }
}
