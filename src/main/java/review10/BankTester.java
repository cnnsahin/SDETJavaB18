package review10;

public class BankTester {
    public static void main(String[] args) {
       BankAccount b= new BankAccount(1200, "username123", "pass123");
       //b.balance=-9000; if we don't make private instancevariables
        b.setBalance(4500);

        //b.printBalance();
        System.out.println(b.getBalance());

    }
}
