package java1702.javase.exercise;

/**
 * Created by HP on 2017/3/14.
 */
//求水仙花数 例如 153 = 1^3 + 5^3 +3^3 = 1 + 125 +27
    //下面求得是四位数的
public class E3 {
    public static void main(String[] args) {
        for (int i = 1000; i <10000 ; i++) {
            //1234 ==1*1*1*1 + 2*2*2*2 + 3*3*3*3 + 4*4*4*4
            int wan = i /1000;    // 千位数
            int bai = i /100 % 10;  //百位数
            int shi = i /10 % 10;  // 十位数
            int ge = i % 10;       //个位数
            if (i == wan * wan * wan * wan + bai*bai*bai*bai + shi*shi*shi*shi  + ge*ge*ge*ge) {
                System.out.println(i);
            }
        }
    }
}
