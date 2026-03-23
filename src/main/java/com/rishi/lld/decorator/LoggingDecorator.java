package com.rishi.lld.decorator;

import com.rishi.services.payment.PaymentService;

public class LoggingDecorator implements PaymentService {

    private PaymentService paymentService;

    public LoggingDecorator(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Logging: Payment of amount " + amount + " is being processed.");
        paymentService.pay(amount);
    }
}
