package java1702.javase.multithreading;

/**
 * Created by ${刘晋勇}
 * on 2017/5/10.
 */
public class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public void withdraw(int money) {
        if (this.money - money < 0) {
            System.out.println("Not enough...");
            return;
        }
        this.money -= money;
    }

    public int getmoney() {
        return money;
    }
}

class AccountTest implements Runnable {
    private Account account;

    @Override
    public void run() {
        account.withdraw(1000);
    }

    public static void main(String[] args) {

    }
}
