package com.rishi.lld.adaptor;

import com.rishi.services.payment.PaymentService;
import com.rishi.services.payment.StripePaymentService;

public class StripeAdaptor implements PaymentService {

    StripePaymentService stripePaymentService;

    public StripeAdaptor(StripePaymentService stripePaymentService){
        this.stripePaymentService = stripePaymentService;
    }

    @Override
    public void pay(int amount) {
        stripePaymentService.makePayment(amount);
    }
}
