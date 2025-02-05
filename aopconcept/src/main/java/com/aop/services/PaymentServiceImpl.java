package com.aop.services;

public class PaymentServiceImpl implements PaymentService {

    @Override
    public void makePayment(int amount) {
        // Simulate payment process
        System.out.println(amount + " Amount Debited");
        System.out.println(amount + " Amount Credited");
    }
}
