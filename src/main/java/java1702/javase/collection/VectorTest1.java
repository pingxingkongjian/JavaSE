package java1702.javase.collection;

import java.util.Vector;

/**
 * Created by 刘晋勇 on.
 * 2017/4/8  9:53.
 */
public class VectorTest1 {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>(100000,1000); //increment 增量，增加
        for (int i = 0; i < 100; i++) {
            strings.add("hello");
        }
        strings.clear();  //清除
        strings.add("hi");
        System.out.println(strings.size());  // 大小
//        System.out.println(strings.get(0));
        System.out.println(strings.capacity()); // capacity 容量


    }
}
