package com.nglobal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableJpaRepositories
public class WsmtBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsmtBackendApplication.class, args);
	}

}
