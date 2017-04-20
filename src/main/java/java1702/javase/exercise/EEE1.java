package java1702.javase.exercise;
import java.util.Calendar;
import java.util.Scanner;
/**
 * Created by 刘晋勇 on.
 * 2017/3/23  14:43.
 */


public class EEE1 {
    static public void main(String [] args){
        Calendar c = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year= sc.nextInt();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, Calendar.JANUARY);
        c.set(Calendar.DAY_OF_MONTH, 1);
        while(c.get(Calendar.YEAR)==year){
            int wday=c.get(Calendar.DAY_OF_WEEK);
            int mday=c.get(Calendar.DAY_OF_MONTH);
            if(mday==1){
                System.out.println("\n日\t一\t二\t三\t四\t五\t六\t第"+(c.get(Calendar.MONTH)+1)+"月");
                System.out.println("---------------------------------------------------");
                for(int i=0;i<wday-1;i++) {
                    System.out.print(" \t");
                }
            }
            System.out.print(mday+"\t");
            if(wday==7) System.out.println();
            c.add(Calendar.DAY_OF_YEAR, 1);
        }
    }
}

