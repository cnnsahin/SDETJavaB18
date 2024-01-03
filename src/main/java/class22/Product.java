package class22;

public class Product {
    private String productID;
    private String productName;
    private double price;
    private int stockQuantity;
    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
    public String getProductID() {
        return productID;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
    public void restock(int amount){
        if (amount>0){
            this.stockQuantity+=amount;
            System.out.println(amount + " some products added to stock");
        }else {
            System.out.println("Invalid restock amount");
        }
    }
    public double sell(int amount){
        if (amount > 0 && amount <= this.stockQuantity) {
            this.stockQuantity -= amount;
            double totalPrice = amount * this.price;
            System.out.println(amount + " units sold. Total Sale Price: $" + totalPrice);
            return totalPrice;
        } else {
            System.out.println("Invalid sell amount or insufficient stock.");
            return 0.0;
        }
    }

    public void printProductDetails(){
        System.out.println(productName+ " " + productID+ " " + price + " " + stockQuantity);
    }
}
