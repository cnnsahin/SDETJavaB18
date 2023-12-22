package Homeworks;

public abstract class Vehicle {

    String color;
    int speed;
    int doorNumber;

    public Vehicle(String color, int speed, int doorNumber) {
        this.color = color;
        this.speed = speed;
        this.doorNumber = doorNumber;
    }
    public void accelerate(int increase) {
        speed += increase;
        System.out.println("Vehicle is accelerating. Current speed: " + speed);
    }    public void brake(int decrease) {
        speed -= decrease;
        System.out.println("Vehicle is braking. Current speed: " + speed);
    }
}
class Car extends Vehicle {

    public Car(String color, int speed, int doorNumber) {
        super(color, speed,doorNumber);
    }
    public void brake(int decrease) {
        speed -= decrease*2;
        System.out.println("Car is braking. Current speed: " + speed);
    }
}
class Truck extends Vehicle{
    public Truck(String color, int speed,int doorNumber){
        super(color, speed,doorNumber);
    }
    public void loadCargo() {
        System.out.println("Truck is loading cargo.");
    }
}
class Motorcycle extends Vehicle {
    public Motorcycle(String color, int speed, int doorNumber) {
        super(color, speed, doorNumber);
    }
}
class Bicycle extends Vehicle {
    public Bicycle(String color, int speed, int doorNumbers) {
        super(color,speed, doorNumbers);
    }}