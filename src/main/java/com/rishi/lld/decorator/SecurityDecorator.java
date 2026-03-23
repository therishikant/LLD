package com.rishi.lld.decorator;

import com.rishi.services.payment.PaymentService;

public class SecurityDecorator implements PaymentService {

    PaymentService paymentService;

    public SecurityDecorator(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Performing security checks before payment.");
        paymentService.pay(amount);
    }
}
