package Homeworks;

public class Product {
    private double price;
    String name;
    private String SKU;
    public Product(double price, String name, String SKU) {
        this.price = price;
        this.name = name;
        this.SKU = SKU;
    }
    public double getPrice() {
        return price;
    }
    public double calculateTax() {
        return 0.1 * price;
    }
    public static  class Electronics extends Product {
        public Electronics(double price, String name, String SKU) {
            super(price, name, SKU);
        }

        public void applyWarranty() {
        }

        @Override
        public double calculateTax() {

            return 0.15 * getPrice();
        }
    }
    public static class Clothing extends Product {
        public Clothing(double price, String name, String SKU) {
            super(price, name, SKU);    }
        @Override
        public double calculateTax() {

            return 0.07 * getPrice();
        }
    }
    public static class Furniture extends Product {
        public Furniture(double price, String name, String SKU) {
            super(price, name, SKU);    }
        @Override
        public double calculateTax() {

            return 0.1 * getPrice();
        }
    }
    public static class Books extends Product {
        public Books(double price, String name, String SKU) {
            super(price, name, SKU);    }
        @Override
        public double calculateTax() {

            return 0.01;
        }
    }
}