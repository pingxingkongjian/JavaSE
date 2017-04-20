package java1702.javase.collection;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by 刘晋勇 on.
 * 2017/4/10  8:58.
 */
public class NewHashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();// K - key 键 V - value 值  K -> V

        hashtable.put(1,"a");
        hashtable.put(100,"hello");

//        hashtable.remove(0);
//        hashtable.clear();
        System.out.println(hashtable.size());
        System.out.println(hashtable.get(100));

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer);
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey()+ "->" + integerStringEntry.getValue() );
        }

        System.out.println(hashtable.toString());


    }
}
