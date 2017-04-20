package java1702.javase.collection;

import java.util.LinkedList;

/**
 * Created by 刘晋勇 on.
 * 2017/4/11  9:51.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("a");
        strings.add("b");

        System.out.println(strings.size());
        System.out.println(strings.get(1));

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.getFirst());
        System.out.println(strings.getLast());


    }
}
