package controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import models.Payment;
import openfeign.PaymentsProxy;

@RestController
public class PaymentController {
	
	private final PaymentsProxy paymentsProxy;
	
	// Injecting the OpenFeign Client
	public PaymentController(PaymentsProxy paymentsProxy) {
		this.paymentsProxy = paymentsProxy;
	}
	
	@PostMapping("/payment")  // the path to our own backend
	public Payment createPayment(
			@RequestBody Payment payment) { // we extract the object sent by the client
		String requestId = UUID.randomUUID().toString(); // set the requestId sent to the external API
		return paymentsProxy.createPayment(requestId, payment); // we return the Payment object returned from the external API _1
	}
}
