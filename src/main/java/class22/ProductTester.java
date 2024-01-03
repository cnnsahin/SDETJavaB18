package class22;

import java.sql.SQLOutput;

public class ProductTester {
    public static void main(String[] args) {
        Product p = new Product("YSH12", "Laptop", 999.99, 100);
        System.out.println("Product is: " + p.getProductName()+ "Product ID is: " +p.getProductID() + "" );
        p.setProductName(" Smart Tv");
        System.out.println("After changing product's new name is  " + p.getProductName());
        p. setPrice(1100.99);
        System.out.println("Product price was changed and now : " + p.getPrice());
        p.restock(30);
        p.sell(25);

        p.printProductDetails();

    }
}
