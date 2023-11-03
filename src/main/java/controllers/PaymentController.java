package controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.Payment;
import openfeign.PaymentsProxy;
import reactor.core.publisher.Mono;

@RestController
public class PaymentController {
	
	//private final PaymentsProxy paymentsProxy;
	
	private final webclient.PaymentsProxy paymentsProxyWC;
	
	// Injecting the OpenFeign Client
	public PaymentController(
			//PaymentsProxy paymentsProxy,
			webclient.PaymentsProxy paymentsProxyWC) {
		//this.paymentsProxy = paymentsProxy;
		this.paymentsProxyWC = paymentsProxyWC;
	}
	
	// OPEN FEIGN EXAMPLE
	/*
	@PostMapping("/payment")  // the path to our own backend
	public Payment createPayment(
			@RequestBody Payment payment) { // we extract the object sent by the client
		String requestId = UUID.randomUUID().toString(); // set the requestId sent to the external API
		return paymentsProxy.createPayment(requestId, payment); // we return the Payment object returned from the external API _1
	}
	*/
	
	// WEBCLIENT EXAMPLE
	@PostMapping("/webclientpay")
	public Mono<Payment> createPaymentWC(   // Mono is a Publisher, what returns the Producer to the Subscriber
			@RequestBody Payment payment) {
		String requestId = UUID.randomUUID().toString();
		return paymentsProxyWC.createPayment(requestId, payment);
	}
}
