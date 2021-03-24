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
@ComponentScan("com.smart") 
@EntityScan(basePackages = {"com.smart"})
@EnableConfigurationProperties
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.smart.repo")
@EnableScheduling
public class FacturaSmartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FacturaSmartApplication.class, args);
	}

}
