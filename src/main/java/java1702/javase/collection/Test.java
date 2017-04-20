package java1702.javase.collection;


import java.util.Date;

/**
 * Created by 刘晋勇 on.
 * 2017/3/28  15:19.
 */
public class Test {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.charAt(s.length()-1));//返回指定索引处的 char 值
        System.out.println(s.concat("ni hao"))  ; //将指定字符串连接到此字符串的结尾。
        System.out.println(s.contains("h"));       //当且仅当此字符串包含指定的 char 值序列时，返回 true
        System.out.println(s.endsWith("lo"));   //测试此字符串是否以指定的后缀结束
        System.out.println(s.equals("hello"));//将此字符串与指定的对象比较

        System.out.println(s.equalsIgnoreCase("Hello"));
        //将此 String 与另一个 String 比较，不考虑大小写。

        System.out.println(String.format("yyyy-MM-dd HH:mm:ss",new Date()));
        System.out.println(s.getBytes());
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(s.matches("5"));

        //replace 译：取代
        System.out.println(s.replace("l","a"));
        //使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串

        System.out.println(s.replaceAll("l","a"));
        //使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。

        System.out.println(s.replaceFirst("l","a"));
        //使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串

        // split 分裂\ [splɪt]

        String[] strings = s.split("\\s+"); // space 空格
        System.out.println(strings.length); // 10 12 11
        for (String string : strings) {
            System.out.println(string);
        }
//        System.out.println("boo:and:foo".split("o", 4).length);

        for (String o : "boo:and:foo".split("o", -10)) { // ?
            System.out.println("'" + o + "'");
        }
        System.out.println(s.substring(s.indexOf('w')));
        System.out.println(s.trim()); // trim 修剪\ [trɪm]
        System.out.println(s.replace(" ", ""));

        System.out.println(String.valueOf(123));
        System.out.println("----------");

        String s1 = "hello";
        String s2 = new String(s1);//"hello";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s3 = "hello";
        System.out.println(s1 == s3);

        /*
        String pool 池\ [puːl] 字符串池
        s1---
            |
        -----------------------
        |  "hello"   "hello"    |
        |  "test..." "test" "hi"|
        -----------------------
            C memory leak 内存泄露  pointer 指针
            Java gc garbage collection 垃圾回收机制
         */

        // immutable 不可变的
        String string = "test...";
        System.out.println(string);
        string = "test";
        string = "hi";
        System.out.println(string); // ?

//        System.gc();
    }

}


