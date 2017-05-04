package java1702.javase.reflect;

/**
 * Created by ${刘晋勇}
 * on 2017/5/3.
 */
public class Chinese {
    private int i;

    public Chinese(int i) {
        this.i = i;
    }

    public void m(String s) {
        System.out.println(s);
    }
}

class ChineseText {
    public static void main(String[] args) throws ClassNotFoundException {
        Chinese chinese = new Chinese(1);
        Class<Chinese> chineseClass1 = Chinese.class;
        Class chineseClass2 = chinese.getClass();
        Class chineseClass3 = Class.forName("java1702.javase.reflect.Chinese");
    }
}
