package Homeworks;

import java.util.ArrayList;
import java.util.List;

public class BankAccountTester {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount(123456, 1000.0, "Canan Sahin", 5.0));
        accounts.add(new CheckingAccount(789012, 2000.0, "Jean Jack Rousseau", 500.0));
        accounts.add(new FixedDepositAccount(345678, 5000.0, "Michel Foucault", 12));
        for (BankAccount account : accounts) {
            account.deposit(100.0);
            account.withdraw(50.0);
        }
        SavingsAccount savingsAccount = (SavingsAccount) accounts.get(0);
        savingsAccount.applyInterest();
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.accountHolderName);
            System.out.println("Account Number: " + account.accountNumber);
            System.out.println("Current Balance: $" + account.balance);
            System.out.println("----------------------");
        }

    }

    }


