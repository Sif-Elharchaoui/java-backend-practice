package week1.OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter starting balance: ");
        double startBalance = sc.nextDouble();

        BankAccount account = new BankAccount(name, startBalance);
        System.out.println("Owner: " + account.getOwnerName() + ", Balance: " + account.getBalance());

        account.deposit(1000);
        account.withdraw(300);
        System.out.println("Balance: " + account.getBalance());

        account.withdraw(999999);   // rejected
        account.deposit(-50);        // rejected

        BankAccount defaultAcc = new BankAccount();
        System.out.println("Owner: " + defaultAcc.getOwnerName() + ", Balance: " + defaultAcc.getBalance());

        BankAccount shared = account;   // same object, not a copy
        shared.deposit(100);
        System.out.println("account's balance after depositing via shared: " + account.getBalance());
    }
}