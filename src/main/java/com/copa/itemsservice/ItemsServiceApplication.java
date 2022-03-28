package com.copa.itemsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ItemsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemsServiceApplication.class, args);
	}

}
