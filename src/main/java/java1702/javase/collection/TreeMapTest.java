package java1702.javase.collection;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by 刘晋勇 on.
 * 2017/4/12  9:57.
 */
public class TreeMapTest {
    public static void main(String[] args) {

        TreeMap<String,Integer> map = new TreeMap<>();

        map.put("a",10);
        map.put("b",100);
        map.put("bc",-1);

        System.out.println(map.size());
        System.out.println(map.get("b"));

        for (String s : map.keySet()) {
            System.out.println(s + "-->" + map.get(s));
        }

    }
}
