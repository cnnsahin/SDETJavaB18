package class18;

public class Product {
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public double calculatePrice() {
        return price * quantity;
    }
}
class DiscountedProduct extends Product {
    public double discountRate;

    public DiscountedProduct(String productName, double price, int quantity, double discountRate) {
        super(productName, price, quantity);
        this.discountRate = discountRate;
    }
    public double calculatePrice() {
        double discountedPrice = super.calculatePrice() * (1 - discountRate);
        return discountedPrice;
    }
}


