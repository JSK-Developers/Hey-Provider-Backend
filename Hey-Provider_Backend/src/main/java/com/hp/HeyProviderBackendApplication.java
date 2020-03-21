package com.hp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ComponentScan("com.hp")
//@EntityScan("com.hp.entity")
//@EnableJpaRepositories("com.hp.repository")
public class HeyProviderBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HeyProviderBackendApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
