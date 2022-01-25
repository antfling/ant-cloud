package com.antfling.bus.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
@RefreshScope
public class ClientApplication {

	@GetMapping("/")
	public String home() {
		return "Hello client!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

}
