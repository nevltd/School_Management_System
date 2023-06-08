package com.quester.smsapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SmsApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmsApiGatewayApplication.class, args);
	}

}
