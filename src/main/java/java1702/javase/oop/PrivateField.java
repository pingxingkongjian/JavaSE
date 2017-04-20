package java1702.javase.oop;

/**
 * Created by 刘晋勇 on.
 * 2017/3/20  14:36.
 */
public class PrivateField {
    private int x;
    private int y;

    public int add() {
        return x + y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

}


class PrivateFieldText {
    public static void main(String[] args) {
        PrivateField privateField = new PrivateField();

        privateField.setX(5);
        privateField.setY(6);


        System.out.println(privateField.add());
    }



}
