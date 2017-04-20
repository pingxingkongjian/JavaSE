package java1702.javase.basic;

/**
 * Created by HP on 2017/3/15.
 */
public class Vehicle {

        //1.fields

        String name = "red";
        double price = 447;  //价格
        char color;

        //2.constructor

    public void start() {
        System.out.println("name  + color + price ");
    }
    public void stop() {
        System.out.println("java1702.javase.basic.Vehicle is stopped");
    }
}

class Bicycle extends Vehicle {
        String type;

    public void ring() {
        System.out.println("java1702.javase.basic.Bicycle is ringing...");
    }

}



class Ship extends Vehicle {
        boolean easy;
        public void run() {
            System.out.println("java1702.javase.basic.Ship is run fast..");
        }
}

class Plane extends Vehicle {
    double weight;
    public void transport() {
        System.out.println("java1702.javase.basic.Plane is transport..");
    }

}

class VehicleText {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.price);
        vehicle.start();
        vehicle.stop();

        System.out.println("----------------------");

        Bicycle bicycle = new Bicycle();
        System.out.println(bicycle.color);
        System.out.println(bicycle.type);
        bicycle.start();
        bicycle.ring();

        System.out.println("-----------------------");

        Ship ship = new Ship();
        System.out.println(ship.name);
        System.out.println(ship.easy);
        ship.run();
        ship.start();

        System.out.println("-----------------------");

        Plane plane = new Plane();
        System.out.println(plane.weight);
        System.out.println(plane.price);
        plane.transport();
        plane.start();



    }
}
