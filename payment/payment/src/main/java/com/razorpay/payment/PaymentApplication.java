package com.razorpay.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PaymentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
	}

// 1.   private Razorpaypayment paymentService = new Razorpaypayment();//tight coupling here


// 2.   private Razorpaypayment paymentService ;//Constructor Dependancy injection
//
//    public PaymentApplication(Razorpaypayment paymentService) {
//        this.paymentService = paymentService;
//    }
//

//    3.
//    @Autowired
//    private Razorpaypayment paymentService ; // Field dependancy injection



//    cheaking loose coupling here
//    if You want to run Razorpay then apply @component on Razorpay class method
//    if You want to run Stripepayment then apply @component on Stripepayment class method
//    but this is not a right way to do this
//    right way is to do apply controll bean configration
//    use application.properties to control bean conf. and there are more way to do this also

    private final Paymentservice paymentservice;

    public PaymentApplication(Paymentservice paymentservice) {
        this.paymentservice = paymentservice;
    }

    @Override
    public void run(String... args) throws Exception {
        String payment = paymentservice.pay();
        System.out.println("Payment successful some" +  payment);
    }
}
