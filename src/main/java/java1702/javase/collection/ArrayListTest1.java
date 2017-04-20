package java1702.javase.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 刘晋勇 on.
 * 2017/4/11  9:00.
 */
public class ArrayListTest1 {
    public static void main(String[] args) {
        List<String> string1 = new ArrayList<>();
        string1.add("a");
        string1.add("b");

        List<String> string2 = new ArrayList<>();
        string2.add("a");
        string2.add("b");
        string2.add("c");

        System.out.println(string1.equals(string2));

        List<String> string3 = new ArrayList<>(string2.subList(1,3));
        System.out.println(string3); //[b,c]

        System.out.println(string3.containsAll(string1)); //false

        string2.removeAll(string3);
        System.out.println(string2); //a
        //removeAll
        //移除此 collection 中那些也包含在指定 collection 中的所有元素（可选操作）。
        // 此调用返回后，collection 中将不包含任何与指定 collection 相同的元素

        // retain 保留\ [rɪ'teɪn]
        string3.retainAll(string2);
        System.out.println(string3);
        //retainAll
        //仅保留此 collection 中那些也包含在指定 collection 的元素（可选操作）。
        // 换句话说，移除此 collection 中未包含在指定 collection 中的所有元素

    }
}
