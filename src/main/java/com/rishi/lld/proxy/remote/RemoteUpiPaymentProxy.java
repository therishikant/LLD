package com.rishi.lld.proxy.remote;

import com.rishi.services.payment.PaymentService;
import com.rishi.services.payment.UpiPaymentService;

public class RemoteUpiPaymentProxy implements PaymentService {

    @Override
    public void pay(int amount) {
        System.out.println("Connecting to remote UPI payment service...");
        PaymentService paymentService = new UpiPaymentService();
        paymentService.pay(amount);
    }
}
