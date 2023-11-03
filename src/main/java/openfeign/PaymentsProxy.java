package openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import models.Payment;

/*
 * Represents the OpenFeign Client interface
 * This interface will be implemented automatically to call the endpoint
 * We identify the proxy with a name, then we set the URI
 * The URL is complete with the method
 * And finally in the arguments are the arguments SENT to the external API
 * Remember this is an INTERFACE, it's not implemented, that's automatic
 * Also, we will need a Configuration Class for this.
 */
//@FeignClient(name = "payments", url = "${name.service.url}") // from .properties
public interface PaymentsProxy {

	@PostMapping("/apipayment")
	Payment createPayment(
			@RequestHeader String requestId,
			@RequestBody Payment payment);
}
