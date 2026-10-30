package task3.payment;

public class Paymentmain {
    public static void main(String[] args) {

        Payment p;             

        p = new UPIpayment();
        p.pay(500);             

        p = new CardPayment();
        p.pay(1200);            

        p = new Cashpayment();
        p.pay(300);          
    }
}