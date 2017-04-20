package java1702.javase.collection;


import java1702.javase.oop.NewSuperClass;

import java.util.*;

/**
 * Created by 刘晋勇 on.
 * 2017/3/31  11:50.
 */
public class ListTest extends ArrayList {
    public static void main(String[] args) {
//        Iterator  可迭代的
//        Collection 集合
//        List 列表
//        Set 集合
//        Map 映射
//        Vector

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("hello");
        arrayList.add("test");
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.contains("hi")); //如果此列表中包含指定的元素，则返回 true,反之false
        System.out.println(arrayList.indexOf("hello"));//返回此列表中首次出现的指定元素的索引，或如果此列表不包含元素，则返回 -1。
        System.out.println(arrayList.isEmpty());//如果此列表中没有元素，则返回 true
        System.out.println(arrayList.remove(1));//移除此列表中指定位置上的元素
        System.out.println("---->" + arrayList);
        System.out.println(arrayList.set(1, "ih")); //用指定的元素替代此列表中指定位置上的元素。（下面重新输出才可以显示被修改的值）
        System.out.println(arrayList);
        arrayList.clear();
        Object[] objects = arrayList.toArray();


        ListTest listTest = new ListTest();
        for (int i = 0; i < 10; i++) {
            listTest.add("" + i);
        }
        listTest.removeRange(3, 5);
        for (Object o : listTest) {
            System.out.println(o);
        }

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList.add("hello");
        System.out.println(arrayList.size());
        arrayList1.removeAll(arrayList);
        System.out.println(arrayList.size());
    }
}
