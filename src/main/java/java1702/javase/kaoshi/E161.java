package java1702.javase.kaoshi;

import java.util.Scanner;

/**
 * Created by ${刘晋勇}
 * on 2017/5/6.
 */
public class E161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入0-100之间的数字：");

        int s = scanner.nextInt();
        s = s/10;
        switch (s) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良好");
                break;
            case 7:
                System.out.println("中等");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                if (s >= 0 && s <= 59) {
                    System.out.println("不及格");
                } else {
                    System.out.println("成绩输入有误!");
                }
                break;
        }
    }
}
