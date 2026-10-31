package oopstest;

interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class Cash implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " in Cash");
    }
}

public class Paymentsystem {
    public static void main(String[] args) {
        Payment p;

        p = new UPI();
        p.pay(500);

        p = new CreditCard();
        p.pay(1000);

        p = new Cash();
        p.pay(200);
    }
}
