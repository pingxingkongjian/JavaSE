package java1702.javase.exercise;

/**
 * Created by 刘晋勇 on.
 * 2017/3/25  11:22.
 */
public class Test5 {

        private static void method(int i) {
            System.out.println("b: " + i);
            i++;
            System.out.println("c: " + i);
        }

        public static void main(String[] args) {
            int i = 0;
            System.out.println("a: " + i);
            method(i);
            System.out.println("d: " + i);
        }
    }

