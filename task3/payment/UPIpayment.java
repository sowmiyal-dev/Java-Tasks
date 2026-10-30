package task3.payment;

public class UPIpayment extends Payment {
   
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}