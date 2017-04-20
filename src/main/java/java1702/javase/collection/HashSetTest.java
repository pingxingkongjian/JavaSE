package java1702.javase.collection;

import java.util.HashSet;

/**
 * Created by 刘晋勇 on.
 * 2017/4/11  16:13.
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("hi");
        strings.add("test");
        strings.add("hello");
        strings.add("Test");

        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
