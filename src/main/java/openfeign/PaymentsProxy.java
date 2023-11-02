package openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import models.Payment;

/*
 * Represents the OpenFeign Client interface
 * This interface will be implemented automatically to call the endpoint
 */
@FeignClient(name = "payments", url = "${name.service.url}") // from .properties
public interface PaymentsProxy {

	@PostMapping("/apipayment")
	Payment createPayment(
			@RequestHeader String requestId,
			@RequestBody Payment payment);
}
