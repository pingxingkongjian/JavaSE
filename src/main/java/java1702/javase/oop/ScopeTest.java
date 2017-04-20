package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/24  8:58.
 */
public class ScopeTest {

    private int i ;    //这类检查搜索冗余字段,可以使用局部变量替换。
//    如果字段的所有本地用法之前作业领域,这个领域可以删除及其用法取代本地变量

    public void method() {
//     int j = 1  ;
//
//        System.out.println(i);
//
//        for (int k = 0; k <10 ; k++) {
//
//        }
//
//        for (int k = 0; k <10 ; k++) {
//
//        }
     int i = 2;
        System.out.println(this.i);
    }

    public static void main(String[] args) {
        ScopeTest scopeTest = new ScopeTest();
        scopeTest.method();
    }
    public void exceptionTest() {
        String s;
        try {
            s = "hello";
        } catch (Exception e) {

        } finally {
            s = "hi";
        }
    }

    static class ShapeTest {
        public static void main(String[] args) {
            Triangle triangle = new Triangle(4,5,6);
            System.out.println(triangle.getArea());
            System.out.println(triangle.getPerimeter());

            CircleTest circleTest = new CircleTest(4);
            System.out.println(circleTest.getPerimeter());
            System.out.println(circleTest.getArea());

            Square square = new Square(1,2,3,5);
            System.out.println(square.getArea());
            System.out.println(square.getPerimeter());


        }
    }
}
