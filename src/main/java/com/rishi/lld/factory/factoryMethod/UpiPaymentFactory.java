package com.rishi.lld.factory.factoryMethod;

import com.rishi.services.payment.PaymentService;
import com.rishi.services.payment.UpiPaymentService;

public class UpiPaymentFactory extends PaymentFactory{
    @Override
    PaymentService cretePayment() {
        return new UpiPaymentService();
    }
}
