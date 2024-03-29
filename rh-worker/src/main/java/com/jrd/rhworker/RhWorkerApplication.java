package com.jrd.rhworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RhWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RhWorkerApplication.class, args);
	}

}
