package class18;

public class CarTester {
    public static void main(String[] args) {
        Car basicCar = new Car("Toyota", "Camry", 2022);
        System.out.println("Basic Car Rental Price: $" + basicCar.calculateRentalPrice(3));

        LuxuryCar luxuryCar = new LuxuryCar("Audi", "Q5", 2023);
        System.out.println("Luxury Car Rental Price: $" + luxuryCar.calculateRentalPrice(3));

        EconomyCar economyCar = new EconomyCar("Honda", "Civic", 2022);
        System.out.println("Economy Car Rental Price: $" + economyCar.calculateRentalPrice(3));
    }
}



