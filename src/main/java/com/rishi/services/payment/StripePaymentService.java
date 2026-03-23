package com.rishi.services.payment;

public class StripePaymentService {
    public void makePayment(int amount){
        System.out.println("Payment to Stripe of amount: " + amount);
    }
}
