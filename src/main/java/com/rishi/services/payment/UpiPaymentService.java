package com.rishi.services.payment;

public class UpiPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
    }
}
