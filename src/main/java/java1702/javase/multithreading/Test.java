package java1702.javase.multithreading;

/**
 * Created by ${刘晋勇}
 * on 2017/5/8.
 */
public class Test implements Runnable{
    public static void main(String[] args) {
        // 进程 process 过程\ ['prəʊses]
        // 线程 thread 线程\ [θred]


//        Test test = new Test();
//        Thread thread = new Thread(test);
        Thread thread = new Thread(new Test());
//        thread.run();
        thread.start();
        System.out.println("test....");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
