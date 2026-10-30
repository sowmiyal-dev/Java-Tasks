package task3.bank;

public class Bankmain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC1001", 5000);

        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Balance: " + acc.getBalance());

        acc.deposit(2000);
        acc.withdraw(1500);
        acc.withdraw(10000);   

        System.out.println("Final Balance: " + acc.getBalance());

      
    }
}