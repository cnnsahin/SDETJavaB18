package Homeworks;

public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(long accountNumber, double balance, String accountHolderName, double interestRate) {
        super(accountNumber, balance, accountHolderName);
        this.interestRate = interestRate;    }
    public void applyInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
    }
}

