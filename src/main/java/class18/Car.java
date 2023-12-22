package class18;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public double calculateRentalPrice(int rentalDays) {
        return 50.0 * rentalDays;
    }
}
class LuxuryCar extends Car {
    public LuxuryCar(String make, String model, int year) {
        super(make, model, year);
    }
    public double calculateRentalPrice(int rentalDays) {
        double basicPrice = super.calculateRentalPrice(rentalDays);
        return basicPrice + 20.0 * rentalDays;
    }
}

class EconomyCar extends Car {
    public EconomyCar(String make, String model, int year) {
        super(make, model, year);
    }
}
