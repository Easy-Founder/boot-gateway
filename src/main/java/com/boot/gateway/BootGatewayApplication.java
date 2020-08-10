package com.boot.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BootGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootGatewayApplication.class, args);
	}

}
