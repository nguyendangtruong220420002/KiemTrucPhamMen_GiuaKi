package com.example.DiscoverServer;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveyServerApplication.class, args);
	}

}
