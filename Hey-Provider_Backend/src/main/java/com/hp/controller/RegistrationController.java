package com.hp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.entity.Registration;
import com.hp.service.RegistrationService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RestController
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	
	@RequestMapping("/users")
	public List<Registration> getUser(){
		return (List<Registration>) registrationService.getAllUser();
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody Registration registration) {
		registrationService.addUser(registration);
	}
	
	@RequestMapping("/users/{id}")
	public Optional<Registration> getSingleUser(@PathVariable Long id){
		return registrationService.getSingleUser(id);
	}
		 
	@PutMapping("/users/{id}")
	public void updateUser(@RequestBody Registration registration,@PathVariable Long id) {
		registrationService.updateUser(id, registration);
	}
	
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable Long id) {
		registrationService.deleteUser(id);
	}
	
	@RequestMapping("users/name/{name}")
	public Registration findByUserName(@PathVariable String name) {
		return registrationService.findByUserName(name);
	}
	
}
