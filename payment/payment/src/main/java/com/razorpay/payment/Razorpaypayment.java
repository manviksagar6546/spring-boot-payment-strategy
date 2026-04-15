package com.razorpay.payment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "control.service", havingValue = "razorpay")
public class Razorpaypayment implements Paymentservice {
    @Override
    public String pay(){
        String payment = "razorPay Payment";
        System.out.println("Payment from "+payment);
        return payment;
    }
}
