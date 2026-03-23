package com.rishi.lld.proxy.logging;

import com.rishi.services.payment.PaymentService;
import com.rishi.services.payment.UpiPaymentService;

public class LoggingProxy implements PaymentService {
    private PaymentService paymentService = new UpiPaymentService();

    @Override
    public void pay(int amount) {
        System.out.println("Logging: Initiating payment of amount: " + amount);
        paymentService.pay(amount);
    }
}
