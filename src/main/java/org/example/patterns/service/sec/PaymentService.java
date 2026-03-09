package org.example.patterns.service.sec;

import java.math.BigDecimal;

/**
 * ===== INTERVIEW TASK: Strategy Pattern (Refactoring) =====
 *
 * Context:
 * The {@link PaymentService} below processes payments using different methods.
 * Currently all the logic lives inside a single method with if/else branching.
 * This violates the Open/Closed Principle — adding a new payment method requires
 * modifying this class.
 *
 * YOUR TASK:
 * Refactor this code to use the Strategy pattern:
 *   1. Create a {@code PaymentStrategy} interface with a method:
 *        {@code void pay(BigDecimal amount)}
 *   2. Create concrete strategy classes for each payment method:
 *        - {@code CreditCardPaymentStrategy}
 *        - {@code PayPalPaymentStrategy}
 *        - {@code CryptoPaymentStrategy}
 *   3. Refactor {@link PaymentService} so that:
 *        - It receives a {@code PaymentStrategy} (via constructor or setter).
 *        - The {@code processPayment} method delegates to the strategy.
 *        - The {@code paymentMethod} string field and all if/else branches are removed.
 *
 * Requirements:
 *   - After refactoring, it should be possible to add a new payment method
 *     WITHOUT modifying any existing class (only by adding a new strategy).
 *   - Preserve the same console output for each payment type.
 *
 * See {@link StrategyInterviewRunner#main} for expected usage after refactoring.
 */
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

