package Homeworks;

public class ProductTester {
    public static void main(String[] args) {
        Product[] products = new Product[4];
        products[0] = new Product.Electronics(1000, "Laptop", "SKU123");
        products[1] = new Product.Clothing(50.0, "T-Shirt", "SKU456");
        products[2] = new Product.Furniture(500, "Table", "SKU789");
        products[3] = new Product.Books(20, "Novel", "SKU012");
        for (Product product : products) {
            System.out.println("Product: " + product.name);
            System.out.println("Price: $" + product.getPrice());
        System.out.println("Tax: $" + product.calculateTax());
        System.out.println("----------------------");


        }
    }
}
