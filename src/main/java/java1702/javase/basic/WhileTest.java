package java1702.javase.basic;

/**
 * Created by HP on 2017/3/10.
 */
public class WhileTest {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {   //conj.\虽然；然而； 当....时候
            System.out.println(i);
            i++;
        }


//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }

        System.out.println("----------");


        int j = 0;
        do { //先运行j
            System.out.println(j);
            j++;
        }while (j > 10 );//j>10 不满足，所以输出0
    }
}
