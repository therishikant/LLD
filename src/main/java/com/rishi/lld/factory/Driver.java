package com.rishi.lld.factory;

import com.rishi.lld.factory.abstractFactory.DarkUIFactory;
import com.rishi.lld.factory.abstractFactory.UIAbstractFactory;
import com.rishi.models.button.Button;
import com.rishi.models.checkbox.Checkbox;

public class Driver {
    public static void main(String[] args) {
//        Factory Method
//        PaymentFactory paymentFactory = new CreditCardPaymentFactory();
//        Payment payment = ((CreditCardPaymentFactory) paymentFactory).cretePayment();
//        payment.pay(100);

//        Abstract Factory
        UIAbstractFactory factory = new DarkUIFactory();
        Button darkButton = factory.createButton();
        Checkbox darkCheckbox = factory.createCheckbox();
        darkCheckbox.paint();
        darkButton.paint();
    }
}
