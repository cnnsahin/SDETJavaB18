package review10;

public class BankAccount {

    private String userName;
    private String password;
    private double balance;
    public BankAccount(double balance, String userName, String password) {
        setUserName(userName);
        setPassword(password);
        setBalance(balance);

        if (balance < 0) {
            System.out.println("Wrong balance amount");
        }
        {
            this.balance = balance;
        }
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Wrong balance amount");
            this.balance = 0;
        } else {
            this.balance = balance;

        }
    }
   public  void setUserName(String userName){
        if(userName.length()<4){
            System.out.println("Username should be more than 4 characters");
        }else{
            this.userName=userName;
        }
    }
    public void setPassword(String password){
        this.password=password;
    }

   public  void transferFunds(double amountToTransfer){
        balance=balance-amountToTransfer;
    }
public void printBalance(){
    System.out.println(balance);
}
public double getBalance(){
        return balance;
}

}
