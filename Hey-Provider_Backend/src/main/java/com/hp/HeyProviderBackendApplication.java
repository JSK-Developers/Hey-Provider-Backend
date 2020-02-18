package com.hp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.hp")
//@EntityScan("com.hp.entity")
//@EnableJpaRepositories("com.hp.repository")
public class HeyProviderBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyProviderBackendApplication.class, args);
	}

}
