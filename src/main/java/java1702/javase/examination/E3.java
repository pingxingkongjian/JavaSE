package java1702.javase.examination;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by 刘晋勇 on.
 * 2017/4/1  14:46.
 */
// 使用键盘录入一个字符串，
// 获取字符串中每一个字符出现的次数，要求统计结果格式为：a(5),b(4),c(3),d(2),e(1)
public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串:");
        String str = scanner.next();

        Map<String, Integer> map = new LinkedHashMap<>();

        int i = 0;
        while (str.length() > 0) {
            i = str.length();
            String s = str.substring(0, 1);
            str = str.replaceAll(s, "");
            map.put(s, i - str.length());
        }
        System.out.println(map);
    }
}
