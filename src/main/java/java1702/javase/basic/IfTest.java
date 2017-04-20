package java1702.javase.basic;

/**
 * Created by HP on 2017/3/8.
 */
public class IfTest {
    public static void main(String[] args) {
        int grade = 65; // n.\ 年级；等级；成绩；级别；阶段
        if (grade >= 85) {
            System.out.println("优秀。");
        }
        else if (grade >= 75) {
            System.out.println("良好。");
        }
        else if (grade >= 60) {
            System.out.println("及格。");
        }
        else { // adv.\ 其他；否则；另外
            System.out.println("不及格。。。");
        }
    }
}
