package Homeworks;

public class FixedDepositAccount extends BankAccount {
    private int termInMonths;
    public FixedDepositAccount(long accountNumber, double balance, String accountHolderName, int termInMonths) {
        super(accountNumber, balance, accountHolderName);
        this.termInMonths = termInMonths;
    }
}
