package com.rishi.lld.factory.simpleFactory;

import com.rishi.services.payment.CreditCardPaymentService;
import com.rishi.services.payment.PaymentService;

public class SimpleFactory {
    public static PaymentService createPayment(String type){
        if (type.equalsIgnoreCase("credit")){
            return new CreditCardPaymentService();
        } else {
            throw new IllegalArgumentException("Invalid payment type");
        }
    }
}
