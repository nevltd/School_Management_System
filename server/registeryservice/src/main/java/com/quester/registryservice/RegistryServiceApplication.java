package com.quester.registryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "entity")
public class RegistryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryServiceApplication.class, args);
	}

}
