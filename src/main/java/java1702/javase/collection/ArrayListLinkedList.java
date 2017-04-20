package java1702.javase.collection;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by 刘晋勇 on.
 * 2017/4/11  15:56.
 */
public class ArrayListLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i + "");
            linkedList.add(i + "");
        }

        long timel = System.currentTimeMillis();
        System.out.println(arrayList.remove(1000000 - 1));
        long time2 = System.currentTimeMillis();
        System.out.println(linkedList.remove(1000000 - 1));
        long time3 =System.currentTimeMillis();

        System.out.println("arrayList" + (time2 - timel));
        System.out.println("linkedList" + (time3 - time2));
    }
}
