package com.SuchoEcom.ProductService.V1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ProductServiceV1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceV1Application.class, args);
	}

}
