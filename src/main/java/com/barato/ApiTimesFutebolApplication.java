package com.barato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.barato.model.entities")
public class ApiTimesFutebolApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiTimesFutebolApplication.class, args);
	}

}
