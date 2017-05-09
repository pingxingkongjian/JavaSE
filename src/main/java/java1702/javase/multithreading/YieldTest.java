package java1702.javase.multithreading;

/**
 * Created by ${刘晋勇}
 * on 2017/5/9.
 */
public class YieldTest implements Runnable {
    public static void main(String[] args) {
        // yield vt.\[jiːld] 屈服 让步；
        Thread thread1 = new Thread(new YieldTest(),"thread 1");
        Thread thread2 = new Thread(new YieldTest(),"thread 2");

        thread1.start();
        thread2.start();

        System.out.println("test...");
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ":" + Thread.currentThread().getName() + " is running...");
            if (i % 10 == 0) {
                Thread.yield();
            }
        }
    }
}
