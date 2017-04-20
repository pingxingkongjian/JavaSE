package java1702.javase.collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by 刘晋勇 on.
 * 2017/4/12  11:35.
 */
public class ListIteratorTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");

        ListIterator<String> listIterator = strings.listIterator();
        // next
        while (listIterator.hasNext()) {
            String next =  listIterator.next();
            System.out.println(next);
        }

        // prev

        // index
        // add
        // set
        // remove
    }
}

