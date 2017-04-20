package java1702.javase.exercise;

/**
 * Created by HP on 2017/3/18.
 */
public class T5 {
    public static void main(String[] args) {
        Round round = new Round(2);
        System.out.println(round.volumeRound());
    }
}

class Round {
    int r;

    public Round(int r) {
        this.r = r;
    }
    public double volumeRound() {
        double π = 3.14;
        return (4 / 3) * π * (r ^ 3);
    }
}
