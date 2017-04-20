package java1702.javase.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

/**
 * Created by 刘晋勇 on.
 * 2017/3/29  13:59.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        vector.add("hi");
        vector.add("hello");
        vector.add("test");
        vector.add("hi");

        System.out.println(vector.get(0));
        System.out.println(vector.size());

        for (String s : vector) {
            System.out.println(s);
        }
        System.out.println(vector.size());
        System.out.println(vector.capacity());

        System.out.println("-------------------------------");

        // capacity 容量,\ 能力,\ 容积

        Vector<Integer> integers = new Vector<>();
        integers.add(1);
        integers.add(10);
        integers.add(100);
        System.out.println(integers.size());
        System.out.println(integers.capacity());
        integers.setElementAt(9, 0);
        integers.setElementAt(99, 1);
        System.out.println("->" + integers.set(2, 999));

        integers.remove(0);
        integers.clear();
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        System.out.println("-------------------------------");

        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("aa");
        strings.add("aaa");
        strings.add("aaa");
        System.out.println(strings.size());
    }
}

