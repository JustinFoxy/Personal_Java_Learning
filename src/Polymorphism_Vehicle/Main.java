package Polymorphism_Vehicle;

public class Main {
    public static void main(String[] args) {
        //
        Vehicle car = new Car();
        Vehicle boat = new Boat();
        Vehicle plane = new Plane();
        //
        car.move();
        boat.move();
        plane.move();
    }
}
