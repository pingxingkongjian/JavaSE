package java1702.javase.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 刘晋勇 on.
 * 2017/4/12  16:00.
 */
public class E2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tom", 1000);
        map.put("jerry", 800);
        map.put("Jack", 800);
        map.put("Amy", 900);

        System.out.println("所有员工的姓名：");

        for (String s : map.keySet()) {
            System.out.println(s);
        }

        System.out.println("所有员工的姓名及其工资：");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "工资:" + entry.getValue());
        }

        System.out.println("删除Tom员工信息后其他员工信息：");

        map.remove("Tom");
        for (String s : map.keySet()) {
            System.out.println(s + "工资：" + map.get(s));
        }

        System.out.println("输出 Jack 的工资，并将其工资改为 1500 元:");

        System.out.println(map.get("Jack"));
        map.put("Jack", 1500);

        System.out.println("Jack工资上涨后的工资：");
        System.out.println(map.get("Jack"));


        System.out.println("将所有工资低于 1000 元的员工的工资上涨 20%:");

        for (double integer : map.values()) {
            if (integer <= 1000) {
                integer += integer * 0.2;
                System.out.println(  integer);
            }
        }
    }
}
