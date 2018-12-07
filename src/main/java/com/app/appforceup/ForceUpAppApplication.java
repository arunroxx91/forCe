package com.app.appforceup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootConfiguration
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories({"com.app.forceup.repository"})
@EntityScan({"com.app.forceup.model"})
@ComponentScan({"com.app.forceup.module"  , "com.app.forceup.service","com.app.forceup.helper",  "com.app.forceup.controller", 
	"com.app.forceup.service.BO"})
public class ForceUpAppApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(ForceUpAppApplication.class, args);

	}
}
