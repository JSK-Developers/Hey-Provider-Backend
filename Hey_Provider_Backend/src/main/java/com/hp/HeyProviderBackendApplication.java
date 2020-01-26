package com.hp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hp.entity.UserRegistration;
import com.hp.repository.UserRegistrationRepository;

@SpringBootApplication
public class HeyProviderBackendApplication {

	@Autowired
	private UserRegistrationRepository userRegistrationRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(HeyProviderBackendApplication.class, args);
	}

	
	public void run(String... args) throws Exception {
		userRegistrationRepository.save(new UserRegistration("one", "xys@gmail.com","password","password"));
		userRegistrationRepository.save(new UserRegistration("two", "xys1@gmail.com","password1","password1"));
		userRegistrationRepository.save(new UserRegistration("three", "xys2@gmail.com","password2","password2"));
		
	}
}
