package java1702.javase.practice;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by 刘晋勇 on.
 * 2017/4/15  8:55.
 */
//找出字符串中出现次数最多的字母和出现的次数
public class E117 {
    public static void main(String[] args) {
        String s = "aabbbcccccdefffff";

        Hashtable<Character, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hashtable.put(c, hashtable.get(c) == null ? 1 : hashtable.get(c) + 1);
        }

        int max = Collections.max(hashtable.values());

        System.out.println(max);

        for (Map.Entry<Character, Integer> entry : hashtable.entrySet()) {
            if (max == entry.getValue()) {
                System.out.println(entry.getKey());
            }
        }

        /*
        a->2
        b->3
        ...
        c->5
        f->5
         */

        /*
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    n++;
                }
            }
            if (n > max) {
                max = n;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            int n = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    n++;
                }
            }
            if (n == max) {
                System.out.println(s.charAt(i));
            }
        }
        */
    }
}


