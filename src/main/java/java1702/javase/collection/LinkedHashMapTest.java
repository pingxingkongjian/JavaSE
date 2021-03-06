package java1702.javase.collection;

import java.util.LinkedHashMap;

/**
 * Created by 刘晋勇 on.
 * 2017/4/12  9:35.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.put(1,"a");
        map.put(-1,"ab");
        map.put(100,"abc");
        map.put(null,"E");
        map.put(2,null);

        System.out.println(map.size());
        System.out.println(map.get(-1));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + ">" + map.get(integer));
        }

    }
}
