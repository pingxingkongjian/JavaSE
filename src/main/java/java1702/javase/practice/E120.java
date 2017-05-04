package java1702.javase.practice;

import java.util.Scanner;

/**
 * Created by 刘晋勇 on.
 * 2017/4/15  10:34.
 */
//输入一段字符串，字符串中只包含大小写字母。
// 要求完成函数删除给定字符串中出现次数最少的字符。
// 输出删除完的字符串。
// 如果有多个出现次数一样的字符，都为最少时，一并删除。
// 例如：输入:abbccd，输出为bbcc
public class E120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入浮点数值：");
        while (sc.hasNext()) {
            double num = sc.nextDouble();
            int i = (int) num;

            System.out.println((num - i) >= 0.5 ? i + 1 : i);
        }
    }
}
