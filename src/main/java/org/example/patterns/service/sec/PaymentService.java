package org.example.patterns.service.sec;

import java.math.BigDecimal;

public class PaymentService {

    private final String paymentMethod;

    public PaymentService(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(BigDecimal amount) {
        if ("CREDIT_CARD".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Payment of $" + amount + " completed via Credit Card.");

        } else if ("PAYPAL".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Processing PayPal payment of $" + amount);
            System.out.println("Redirecting to PayPal...");
            System.out.println("Payment of $" + amount + " completed via PayPal.");

        } else if ("CRYPTO".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Processing crypto payment of $" + amount);
            System.out.println("Verifying blockchain transaction...");
            System.out.println("Payment of $" + amount + " completed via Crypto.");

        } else {
            throw new UnsupportedOperationException("Unknown payment method: " + paymentMethod);
        }
    }
}

