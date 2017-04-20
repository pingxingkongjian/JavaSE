package java1702.javase.practice;

/**
 * Created by 刘晋勇 on.
 * 2017/4/3  19:52.
 */

//二位数组
public class Test3 {
    public static void main(String[] args) {
        int[][] ints = new int[4][5];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = i + j;
                System.out.print(ints[i][j] + "\t");  //去掉换行 ln "\t"间隔的意思
            }
        System.out.println();
        }
    }
}
