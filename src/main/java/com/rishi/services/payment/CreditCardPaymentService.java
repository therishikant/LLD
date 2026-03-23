package com.rishi.services.payment;

public class CreditCardPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("Processing credit card payment of amount: " + amount);
    }
}
