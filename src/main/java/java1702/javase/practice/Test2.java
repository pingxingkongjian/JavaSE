package java1702.javase.practice;

/**
 * Created by 刘晋勇 on.
 * 2017/4/4  19:44.
 */
//foreach 循环
public class Test2 {
    public static void main(String[] args) {
        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // 打印所有数组元素
        for (int i = 0; i < myList.length; i++) {
            double v = myList[i];
            System.out.println(v); //for循环  (快捷 itar + tab)
        }

        for (double v : myList) {
            System.out.println(v); //foreach 循环 (快捷 iter + tab)
        }

    }
}

