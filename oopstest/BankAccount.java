package oopstest;

public class BankAccount {
    private String accountNumber;
    private double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
        }
    }

    double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("A101", 1000);
        acc.deposit(500);
        acc.withdraw(2000);
        acc.withdraw(300);
        System.out.println("Balance: " + acc.getBalance());
    }
}
