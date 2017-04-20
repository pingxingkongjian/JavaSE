package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/6  16:58.
 */
public class ScopeTest {
    // scope 范围\ [skəʊp]


    public void m(String s) {
        System.out.println(i);

        int i = 1;
        System.out.println(i);

        method();

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

    }

    public void method() {

    }

    private static int i;

}
