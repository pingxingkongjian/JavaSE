package java1702.javase.basic;

/**
 * Created by ${刘晋勇} on.
 * 2017/3/10  10:07.
 */
public class BreakContinueTest {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i==5) { // i==5 快捷键 ctrl + alt + t 选择4
//                break;
//            }
//            System.out.println(i);
//        }

        // 嵌套
        outer: // label: 标签\ ['leɪb\(ə\)l] break to this position

        for (int i = 0; i < 10; i++) {
            System.out.println("i:" + i);
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break outer;
                }
                System.out.println("\tj:" + j);
            }
        }

        System.out.println(1d - .9d); // float point
    }
}