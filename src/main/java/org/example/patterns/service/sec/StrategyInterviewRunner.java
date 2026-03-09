package org.example.patterns.service.sec;

import java.math.BigDecimal;

public class StrategyInterviewRunner {

    public static void main(String[] args) {
        // -------- BEFORE refactoring (current code — works now) --------
        PaymentService creditCard = new PaymentService("CREDIT_CARD");
        creditCard.processPayment(new BigDecimal("99.99"));
        System.out.println("---");

        PaymentService paypal = new PaymentService("PAYPAL");
        paypal.processPayment(new BigDecimal("49.50"));
        System.out.println("---");

        PaymentService crypto = new PaymentService("CRYPTO");
        crypto.processPayment(new BigDecimal("250.00"));


        //
        // PaymentService service1 = new PaymentService(new CreditCardPaymentStrategy());
        // service1.processPayment(new BigDecimal("99.99"));
        // System.out.println("---");
        //
        // PaymentService service2 = new PaymentService(new PayPalPaymentStrategy());
        // service2.processPayment(new BigDecimal("49.50"));
        // System.out.println("---");
        //
        // PaymentService service3 = new PaymentService(new CryptoPaymentStrategy());
        // service3.processPayment(new BigDecimal("250.00"));
    }
}

