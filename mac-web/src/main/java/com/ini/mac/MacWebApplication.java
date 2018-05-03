package com.ini.mac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MacWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacWebApplication.class, args);
	}
}
