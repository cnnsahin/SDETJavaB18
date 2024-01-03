package class21;

public abstract class Vehicle {
    /*
    Vehicle Management System: Design a base class Vehicle with methods
    like startEngine(), stopEngine(), fuelUp(), and fields like make, model, and fuelLevel.
    Create subclasses like Car, Truck, and Motorcycle,
     each with specific implementations for the methods, considering their unique characteristics.
     */

      String make;
      public String model;
      private int fuelLevel;

    public Vehicle(String make, String model, int fuelLevel) {
        this.make = make;
        this.model = model;
        this.fuelLevel = fuelLevel;
    }
    public void startEngine(){

    }
    public void stopEngine(){

    }
    public void fuelUp(){

    }
    public void displayInfo(){
        System.out.println(make+ " " + model+ " " + fuelLevel);
    }
}
 class Car extends Vehicle{

    public Car(String make, String model, int fuelLevel) {
        super(model, make, fuelLevel);
    }

     @Override
     public void stopEngine() {

        super.stopEngine();
     }

     @Override
     public void fuelUp() {

        super.fuelUp();
     }
     public void startEngine(){

        System.out.println(" Some cars  engine starts with remote ");
     }
 }


class Truck extends Vehicle{

    public  Truck(String make, String model, int fuelLevel) {
        super(make, model, fuelLevel);

    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public void fuelUp() {
        super.fuelUp();
    }

    void loadCargo(String make, String model, int fuelUp){

    }


}
class Motorcyle extends Vehicle{
    private int maxSpeed;

    public Motorcyle(String make, String model, int fuelLevel) {
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void stopEngine() {
        super.stopEngine();
    }

    @Override
    public void fuelUp() {
        super.fuelUp();
    }

    public void startWheelie(){

    }
}