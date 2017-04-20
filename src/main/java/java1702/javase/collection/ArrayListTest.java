package java1702.javase.collection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by 刘晋勇 on.
 * 2017/4/10  10:09.
 */
public class ArrayListTest<E> extends ArrayList<E>{
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("test");

//        arrayList.remove(0);
        strings.addAll(strings);
        System.out.println(strings.size());
        System.out.println(strings.contains("hello"));
        System.out.println(strings.containsAll(strings));

        System.out.println(strings.get(1));
        System.out.println(Arrays.toString(strings.toArray()));

        ArrayListTest<Integer> integers = new ArrayListTest<>();

        integers.add(1);
        integers.add(2);
        integers.add(3);

        integers.removeRange(2,3);
        System.out.println(integers.size());
        System.out.println(integers);

    }
}
