package class22;

public class BankAccount {
    private double balance;
   private String userName;
    private String password;

    public BankAccount(double balance, String userName, String password) {
        this.balance = balance;
        this.userName = userName;
        this.password = password;
    }

    void login(){
        System.out.println("Login to Bank Account ");

    }
    void transferFunds(){
        System.out.println("transferring funds");

    }
    void resetPassword(){
        System.out.println("resetting password");
    }
    public double getBalance(){
        return balance;
    }
    void setBalance(double balance){
        this.balance=balance;

    }
}
