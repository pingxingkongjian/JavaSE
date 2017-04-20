package java1702.javase.oop;

import java.util.Scanner;

/**
 * Created by HP on 2017/3/15.
 */
//定义一个判断闰年的方法，在 main 方法中调用该方法判断输入的一个年份是
//否是闰年
//    闰年 年份除以400余数为0，或者除以4余数为0且除以100余数不为0的，为闰年

public class Oop1 {

    private boolean isleapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    public static void main(String[] args) {
        Oop1 oop1 = new Oop1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input year: ");
        int year = scanner.nextInt();

        if (oop1.isleapYear(year)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }


}





