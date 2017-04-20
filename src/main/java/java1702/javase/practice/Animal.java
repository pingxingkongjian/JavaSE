package java1702.javase.practice;

/**
 * Created by 刘晋勇 on.
 * 2017/4/8  15:15.
 */
public interface Animal {
    void eat();
}

class Bird implements Animal {

    @Override
    public void eat() {
        System.out.println("bird is eating...");
    }
}

class Fish implements Animal {

    @Override
    public void eat() {
        System.out.println("fish is eating...");
    }

    void swimming() {
        System.out.println("fish is swimming..");
    }
}

class AnimalTest {
    public static void main(String[] args) {

        Bird bird = new Bird();
        bird.eat();

        Fish fish = new Fish();
        fish.eat();
        fish.swimming();

    }
}
