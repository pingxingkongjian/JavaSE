package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/22  9:06.
 */
public class StaticTest {
//    public static void main(String[] args) {
//        Mankind1 tom = new Mankind1();
//        tom.name = "Tom";
//        tom.age = 18;
//        Mankind1.married = true;
//        System.out.println(tom.name);
//        System.out.println(tom.age);
//        System.out.println(Mankind1.married);
//
//        System.out.println("------------");
//
//        Mankind1 jerry = new Mankind1();
//        jerry.name = "Jerry";
//        jerry.age = 17;
////        jerry.married = false;
//        System.out.println(jerry.name);
//        System.out.println(jerry.age);
//        System.out.println(Mankind1.married);
//    }


}


class Mankind1 {
    private String name;
    private int age;
    private static boolean married;


    public static void main(String[] args) {
        Mankind1 tom = new Mankind1();
        tom.name = "Tom";
        tom.age = 18;
        Mankind1.married = true;
        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(Mankind1.married);

        System.out.println("------------");

        Mankind1 jerry = new Mankind1();
        jerry.name = "Jerry";
        jerry.age = 17;
//        Mankind1.married = false;
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(Mankind1.married);

    }
}
