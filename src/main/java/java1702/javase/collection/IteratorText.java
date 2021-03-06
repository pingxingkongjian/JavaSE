package java1702.javase.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by 刘晋勇 on.
 * 2017/4/12  10:47.
 */
public class IteratorText {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        TreeSet<String> set = new TreeSet<>();
        set.add("b");
        set.add("a");

        Iterator<String> iterator1 = set.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");

        Iterator<Integer> iterator2 = map.keySet().iterator();

        while (iterator2.hasNext()) {
            int key = iterator2.next();
            System.out.println(key + "-->" + map.get(key));
        }
    }
}
