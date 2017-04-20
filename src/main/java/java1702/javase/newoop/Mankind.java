package java1702.javase.newoop;

/**
 * Created by 刘晋勇 on.
 * 2017/4/6  11:49.
 */
//static 静态 修饰域和方法 静态的成员隶属于类对象 用类名来调用
public class Mankind {
    String name;
    static String earth; //地球
}

class NewTest {
    public static void main(String[] args) {
        Mankind tom = new Mankind();
        tom.name = "tom";
        Mankind.earth = "tom 种了一棵树";  // 静态域用类名调用M
        System.out.println(tom.name);
        System.out.println(Mankind.earth);//静态域用类名调用

        Mankind jerry = new Mankind();
        jerry.name = "jerry";
        System.out.println(jerry.name);
        System.out.println(Mankind.earth); //静态域用类名调用
    }
}