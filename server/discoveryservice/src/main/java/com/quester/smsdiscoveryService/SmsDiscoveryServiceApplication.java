package com.quester.smsdiscoveryService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SmsDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsDiscoveryServiceApplication.class, args);
	}

}
