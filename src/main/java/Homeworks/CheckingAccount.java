package Homeworks;

public class CheckingAccount extends BankAccount {
    private double dailyLimit;
    public CheckingAccount(long accountNumber, double balance, String accountHolderName, double dailyLimit) {
        super(accountNumber, balance, accountHolderName);
        this.dailyLimit = dailyLimit;
    }    @Override
    public void withdraw(double amount) {
        if (amount <= dailyLimit) {
        super.withdraw(amount);
        } else {
            System.out.println("Withdrawal amount exceeds daily limit");
        }
    }
}
