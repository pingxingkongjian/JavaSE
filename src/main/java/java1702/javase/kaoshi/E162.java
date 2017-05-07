package java1702.javase.kaoshi;

/**
 * Created by ${刘晋勇}
 * on 2017/5/6.
 */
public class E162 {

    public static void main(String[] args) {
        E162 e162 = new E162();
        e162.mentod(1,2);
        e162.mentod(1,2,3);
        e162.mentod(2,1.5);
    }

    private void mentod(int i, int j) {
        System.out.println(i * j);
    }
    private void mentod(int i ,int j ,int x) {
        System.out.println(i + j + x);
    }
    private void mentod(int i ,double b) {
        System.out.println(i/b);
    }
}


