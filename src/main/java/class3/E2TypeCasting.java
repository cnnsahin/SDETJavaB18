package class3;

public class E2TypeCasting {
    public static void main(String[] args) {
        double price=12.3;
        double quantity=3;
        double totalPrice=price*quantity;
        // we can get rid of decimal part by
        // type casting
        System.out.println((int)totalPrice);//36
    }
}
