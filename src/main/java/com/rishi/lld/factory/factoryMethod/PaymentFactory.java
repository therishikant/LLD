package com.rishi.lld.factory.factoryMethod;

import com.rishi.services.payment.PaymentService;

public abstract class PaymentFactory {
    abstract PaymentService cretePayment();
}
