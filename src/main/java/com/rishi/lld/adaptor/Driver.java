package com.rishi.lld.adaptor;

import com.rishi.services.payment.PaymentService;
import com.rishi.services.payment.StripePaymentService;

public class Driver {
    public static void main(String[] args) {
        PaymentService paymentService = new StripeAdaptor(new StripePaymentService());
        paymentService.pay(100);
    }
}
