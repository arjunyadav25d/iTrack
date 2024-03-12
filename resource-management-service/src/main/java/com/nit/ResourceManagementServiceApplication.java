package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResourceManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceManagementServiceApplication.class, args);
		System.out.println("Resource management module started");
	}

}
