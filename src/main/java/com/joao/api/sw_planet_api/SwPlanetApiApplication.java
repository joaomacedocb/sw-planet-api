package com.joao.api.sw_planet_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.joao")
public class SwPlanetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwPlanetApiApplication.class, args);
	}
}
