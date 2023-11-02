package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * This app represents the actual API we build. The app that "punches" the external API in _1
 * We will see two examples:
 * Spring Cloud OpenFeign
 * WebClient (Web Flux) REACTIVE!
 */

@SpringBootApplication
public class SpilcaRest2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpilcaRest2Application.class, args);
	}

}
