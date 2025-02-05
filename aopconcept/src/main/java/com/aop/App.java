package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

public class App {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");

        // Get the PaymentService bean
        PaymentService paymentObject = context.getBean("payment", PaymentService.class);

        // Make payment
        paymentObject.makePayment(165);
    }
}
