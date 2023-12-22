package class18;

public class ProductTester {
    public static void main(String[] args) {
        Product regularProduct = new Product("Regular Product", 10.0, 2);
        System.out.println("Regular Product Price: $" + regularProduct.calculatePrice());

        DiscountedProduct discountedProduct = new DiscountedProduct("Discounted Product", 15.0, 2, 0.2);
        System.out.println("Discounted Product Price: $" + discountedProduct.calculatePrice());
    }
}

