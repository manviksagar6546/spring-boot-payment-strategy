package com.razorpay.payment;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


//@Service
//@RestController
//@Repository
//@Controller you can Use them they all work same
@Component // it is meta anotation so these upper stereotype come from Component anotation
@ConditionalOnProperty(name = "control.service", havingValue = "stripe")
public class Stripepaymentservice implements Paymentservice {
    @Override
    public String pay() {
        String payment = "Stripepaymentservice";
        System.out.println("Form pay ...." + payment);
        return payment;
    }
}
// here we doing to check who spring give use loose coupling and we can create there loose coupling which
// help us in industry