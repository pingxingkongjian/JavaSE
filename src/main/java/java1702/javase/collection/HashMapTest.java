package java1702.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 刘晋勇 on.
 * 2017/4/12  9:06.
 */
public class HashMapTest {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "a");
        map.put(100, "ab");
        map.put(1000, "abc");

        System.out.println(map.size());
        System.out.println(map.get(100));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + "-->" + map.get(integer));

        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        for (String s : map.values()) {
            System.out.println(s);
        }
    }
}
