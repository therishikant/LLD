package com.rishi.lld.decorator;

import com.rishi.services.payment.PaymentService;

public class PaymentDecorator implements PaymentService {
    PaymentService paymentService;

    public PaymentDecorator(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Basic Paying amount: " + amount);
        paymentService.pay(amount);
    }
}
