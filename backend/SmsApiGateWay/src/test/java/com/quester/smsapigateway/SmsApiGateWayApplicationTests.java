package com.quester.smsapigateway;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class SmsApiGateWayApplicationTests {
	@Autowired
	private WebTestClient webClient;

	@Test
	void contextLoads() throws  Exception{
		webClient
				.get().uri("/***")
				.exchange()
				.expectStatus().isOk();
	}

}
