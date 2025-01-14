package com.example.demomicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoMicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoMicroserviceApplication.class, args);
	}

}
