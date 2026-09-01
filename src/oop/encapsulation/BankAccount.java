package oop.encapsulation;

public class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount() {
        this("Unknown", 0.0);
    }

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive: " + amount);
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive: " + amount);
        }
        if (amount > balance) {
            throw new InvalidAmountException("Insufficient funds: balance is " + balance + ", requested " + amount);
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount);
    }
}