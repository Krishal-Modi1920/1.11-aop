package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.After;

@Aspect
public class MyAspect {

    @Before("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
    public void printBefore() {
        System.out.println("Payment Started");
    }

    @After("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
    public void printAfter() {
        System.out.println("Payment Success");
    }
}
