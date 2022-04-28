package com.ces.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan(basePackages = "com.ces.*")
@EnableJpaRepositories("com.ces.*")
@EntityScan("com.ces.*")
public class CesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CesApplication.class, args);
	}

	public static void start()  {
		SpringApplication.run(CesApplication.class);
	}


}
