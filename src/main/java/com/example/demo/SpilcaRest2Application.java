package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.reactive.function.client.WebClient;

/*
 * This app represents the actual API we build. The app that "punches" the external API in _1
 * We will see two examples:
 * Spring Cloud OpenFeign
 * WebClient (WebFlux) REACTIVE!
 */

@SpringBootApplication
@ComponentScan(basePackages={"controllers","webclient"})
@EnableFeignClients(basePackages= {"openfeign"})
public class SpilcaRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpilcaRest2Application.class, args);
	}

	@Bean
    public WebClient webClient() {
		return WebClient.builder().build();
	}

}
