package com.blazcar.washer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableAutoConfiguration
@EnableMongoRepositories
@SpringBootApplication(scanBasePackages = "com.blazsoft.carwash")
public class CarwashServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarwashServiceApplication.class, args);
	}

}
