package java1702.javase.exercise;

/**
 * Created by ${刘晋勇} on
 2017/3/14.
 */
//裴波那契数列
    //1，1，2，3，5，8，13，21，34，...f(n)
public class E51 {
    /**
     * 求Fibonacci 数列的第n项
     * f(n) = 1 (n=1, n=2)
     * f(n) = f(n-2) + f(n-1)    (n>2)
//     * @param   n数列的第n项
//     * @return Fibonacci(n)
     */
    private int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        else {
         return fibonacci( n-2) + fibonacci(n-1);
        }
    }

    public static void main(String[] args) {
        E51 e51 = new E51();
        System.out.println(e51.fibonacci(6  ));
    }
}
