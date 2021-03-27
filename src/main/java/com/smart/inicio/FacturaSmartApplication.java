package com.smart.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"com.smart.controller", "com.smart.dto",
								 "com.smart.exception",
								 "com.smart.service", "com.smart.service.imp"})
@EnableJpaRepositories(basePackages = {"com.smart.repo"})
@EntityScan(basePackages = {"com.smart.entity"})
public class FacturaSmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturaSmartApplication.class, args);
	}

}
