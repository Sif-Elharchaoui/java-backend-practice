package oop.encapsulation;

import java.util.Scanner;

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter starting balance: ");
        double startBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, startBalance);
        System.out.println("Owner: " + account.getOwnerName() + ", Balance: " + account.getBalance());

        try {
            account.deposit(1000);
            account.withdraw(300);
            System.out.println("Balance: " + account.getBalance());
            account.withdraw(999999);
        } catch (InvalidAmountException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        try {
            account.deposit(-50);
        } catch (InvalidAmountException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }

        BankAccount defaultAcc = new BankAccount();
        System.out.println("Owner: " + defaultAcc.getOwnerName() + ", Balance: " + defaultAcc.getBalance());

        BankAccount shared = account;
        try {
            shared.deposit(100);
        } catch (InvalidAmountException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        System.out.println("account's balance after depositing via shared: " + account.getBalance());
    }
}