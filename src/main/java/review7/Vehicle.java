package review7;

public class Vehicle {
    private String vehicleType;

    public Vehicle(){
        this.vehicleType="vehicles";
        System.out.println(("I love " + vehicleType));
    }
    public Vehicle (String vehicleType){
        this.vehicleType=vehicleType;
        System.out.println(("I love " +vehicleType));
    }

    public static void main(String[] args) {
        Vehicle v1=new Vehicle();
        Vehicle v2= new Vehicle("Train");
        Vehicle v3=new Vehicle ("Bike");
    }



}
