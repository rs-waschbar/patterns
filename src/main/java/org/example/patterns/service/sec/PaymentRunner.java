package org.example.patterns.service.sec;

import java.math.BigDecimal;

public class PaymentRunner {

    public static void main(String[] args) {

        PaymentService creditCard = new PaymentService("CREDIT_CARD");
        creditCard.processPayment(new BigDecimal("99.99"));
        System.out.println("---");

        PaymentService paypal = new PaymentService("PAYPAL");
        paypal.processPayment(new BigDecimal("49.50"));
        System.out.println("---");

        PaymentService crypto = new PaymentService("CRYPTO");
        crypto.processPayment(new BigDecimal("250.00"));

    }
}

