package com.rishi.lld.factory.factoryMethod;

import com.rishi.services.payment.CreditCardPaymentService;
import com.rishi.services.payment.PaymentService;

public class CreditCardPaymentFactory extends PaymentFactory{
    @Override
    public PaymentService cretePayment() {
        return new CreditCardPaymentService();
    }
}
