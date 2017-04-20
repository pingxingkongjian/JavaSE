package java1702.javase.examination;

/**
 * Created by 刘晋勇 on.
 * 2017/4/1  14:46.
 */
public class E5 {
    public static void main(String[] args) {
        int arr[] = new int[] { 1,2,3,4,5,6,};
        for(int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        for (int anArr : arr) {
            System.out.print(" " + anArr); //全部一行
        }
        System.out.println();
    }

}
