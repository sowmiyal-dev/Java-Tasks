package task3.payment;

public class Cashpayment extends Payment {
    
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}