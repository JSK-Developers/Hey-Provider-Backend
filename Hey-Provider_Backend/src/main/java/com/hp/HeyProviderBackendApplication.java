package com.hp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@ComponentScan("com.hp")
//@EntityScan("com.hp.entity")
//@EnableJpaRepositories("com.hp.repository")
public class HeyProviderBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyProviderBackendApplication.class, args);
	}

}
