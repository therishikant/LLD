package com.rishi.lld.decorator;

import com.rishi.services.payment.CreditCardPaymentService;
import com.rishi.services.payment.PaymentService;

public class Driver {
    public static void main(String[] args) {
        PaymentService paymentService = new SecurityDecorator(
                new LoggingDecorator(
                        new PaymentDecorator(
                                new CreditCardPaymentService()
                        )
                )
        );

        paymentService.pay(100);
    }
}
