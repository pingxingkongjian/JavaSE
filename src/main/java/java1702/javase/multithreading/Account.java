package java1702.javase.multithreading;

/**
 * Created by ${刘晋勇}
 * on 2017/5/10.
 */
public class Account {
    private int money;

    public void withdraw() {

    }

    public int getmoney() {
        return money;
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new AccountTest());


    }
}

class AccountTest implements Runnable {
    @Override
    public void run() {

    }
}
