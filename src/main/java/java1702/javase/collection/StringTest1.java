package java1702.javase.collection;

import java.util.Arrays;

/**
 * Created by 刘晋勇 on.
 * 2017/4/7  14:52.
 */
public class StringTest1 {
    public static void main(String[] args) {
        String s ="hello";
        System.out.println(s.charAt(4)); //返回指定索引处的 char 值。
        System.out.println(s.concat("hi")); //将指定字符串连接到此字符串的结尾。
        System.out.println(s.contains("hell")); //当且仅当此字符串包含指定的 char 值序列时，返回 true。
        System.out.println(s.endsWith("lo")); //测试此字符串是否以指定的后缀结束
        System.out.println(s.equals("hello"));// 将此字符串与指定的对象比较。
        System.out.println(s.equalsIgnoreCase("Hello"));
        //将此 String 与另一个 String 比较，不考虑大小写

        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(s.indexOf("o"));
        String i = "";
        System.out.println(i.isEmpty());//当且仅当 length() 为 null 时返回 true
        System.out.println(s.isEmpty());
        System.out.println(s.lastIndexOf("l"));
        System.out.println(s.lastIndexOf("l",4));
        System.out.println(s.length());//返回此字符串的长度。
        System.out.println(s.replace("he","hi"));
        //replace(char oldChar, char newChar)
       // 返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar(要替代的字符) 得到的。

        System.out.println(Arrays.toString(s.split("")));

        System.out.println("");
        
    }
}
