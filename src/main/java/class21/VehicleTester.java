package class21;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] v = {new Car("Audi", "Q5", 87),
                new Truck(" Ford", "F100", 120),

                new Motorcyle("Harley Davidson", "Sportster", 80)
        };
        for (int i = 0; i < v.length; i++) {
            v[i].displayInfo();
            v[i].startEngine();
            v[i].stopEngine();
            v[i].fuelUp();}
        Truck t = new Truck(" Ford", "F100", 120);
        t.loadCargo(" Ford", "F100", 120);
        {
            System.out.println("Trucks are ideal for Cargo");
        }


        }

    }





