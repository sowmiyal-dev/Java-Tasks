package task3.payment;

public class CardPayment extends Payment {
	
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}