package java1702.javase.exercise;

/**
 * Created by 刘晋勇 on.
 * 2017/3/21  14:50.
 */

//输出9 * 9口诀。
public class E16 {
    public static void main(String[] args) {
        /*
        1*1，1*2，
        2*3，2*4
         */

//        for (int i = 0; i <9; i++) {
//
//            for (int j = 0; j < 9; j++) {
//
//                if (i >= j) {
//                    System.out.print((i + 1) * (j + 1) +"\t"); // println 去掉ln
//                }
//            }
//            System.out.println();
//        }
//    }

        for (int i = 0; i <9; i++) {

        for (int j = 0; j < 9; j++) {

            if (i >= j) {
                System.out.print((i + 1) + "*" + (j + 1) + "=" + (i + 1) * (j + 1) +"\t"); // println 去掉ln
            }
        }
        System.out.println();
    }
}
}