package com.cpulover.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.cpulover.microservices")
public class CurrencyConverterMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConverterMicroserviceApplication.class, args);
	}

}
