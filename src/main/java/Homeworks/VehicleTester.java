package Homeworks;

public class VehicleTester {
    public static void main(String[] args) {
       Vehicle [] vehicles= new Vehicle[4];
       vehicles[0]= new Car("Red",70, 4);
       vehicles[1]= new Truck("Blue", 65,2);
       vehicles[2]= new Motorcycle("Orange",72,0);
       vehicles[3]= new Bicycle("White",25,0);
       for (Vehicle v: vehicles){
           v.accelerate(10);
           v.brake(5);
           if (v instanceof Truck) {
               ((Truck) v).loadCargo();
           }
       }
    }
}
