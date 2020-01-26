package com.hp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hp.entity.UserRegistration;
import com.hp.repository.UserRegistrationRepository;


@RestController
@RequestMapping("/api")
@EnableWebMvc
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="/**", allowCredentials = "true")
public class UserRegistrationController {
	@Autowired
	private UserRegistrationRepository userRegistrationRepository;

	@GetMapping("/users")
	public List<UserRegistration> getUsers() {
		return userRegistrationRepository.findAll();
	}
//	  @GetMapping("/user/{id}") 
//	  public UserRegisration getUser(@PathVariable Long id) { 
//		  return userRegistrationRepository.findOne(id); 
//	 }
	 

	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id) {
		userRegistrationRepository.deleteById(id);
		return true;
	}

	@PutMapping("/updateUser")
	public UserRegistration updateUser(@RequestBody UserRegistration userRegistration) {
		return userRegistrationRepository.save(userRegistration);
	}

	@PostMapping("/register")
	public UserRegistration createUser(@RequestBody UserRegistration userRegistration) {
		return userRegistrationRepository.save(userRegistration);
	}
	
	

	
	
}
