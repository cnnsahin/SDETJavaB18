package Homeworks;

public class BankAccount {
    protected long accountNumber;
    protected double balance;
    protected String accountHolderName;
    public BankAccount(long accountNumber, double balance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;    }

    public void deposit(double amount) {
    balance += amount;    }
    public void withdraw(double amount) {
    if (balance >= amount) {
        balance -= amount;
    } else {
        System.out.println("Insufficient funds");
    }
        class SavingsAccount extends BankAccount {
        private double interestRate;
        public SavingsAccount(long accountNumber, double balance, String accountHolderName, double interestRate) {
            super(accountNumber, balance, accountHolderName);        this.interestRate = interestRate;
        }
            public void applyInterest() {
            double interest = balance * interestRate / 100;
            deposit(interest);
        }
    }
         class CheckingAccount extends BankAccount {
        private double dailyLimit;
        public CheckingAccount(long accountNumber, double balance, String accountHolderName, double dailyLimit) {
            super(accountNumber, balance, accountHolderName);
            this.dailyLimit = dailyLimit;    }
            @Override
            public void withdraw(double amount) {
            if (amount <= dailyLimit) {
                super.withdraw(amount);
        } else {
                System.out.println("Withdrawal amount exceeds daily limit");
            }
        }
    }
         class FixedDepositAccount extends BankAccount {
        private int termInMonths;
        public FixedDepositAccount(long accountNumber, double balance, String accountHolderName) {
                 super(accountNumber, balance, accountHolderName);
                 this.termInMonths=termInMonths;
             }
         }
    }}