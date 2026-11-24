
class Payment {

    void pay(double amount) {
        System.out.println("Processing generic payment of Rs." + amount);
    }
}

class CreditCard extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via Credit Card");
    }
}

class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via UPI");
    }
}

public class PaymentDemo {

    public static void main(String[] args) {

        Payment[] payments = {
            new CreditCard(),
            new UPI()
        };

        for (Payment p : payments) {
            p.pay(500.0);
        }
    }
}
