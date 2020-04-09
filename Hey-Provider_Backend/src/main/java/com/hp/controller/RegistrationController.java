package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hp.dto.UserDTO;
import com.hp.entity.Registration;
import com.hp.service.RegistrationService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
@RestController
public class RegistrationController {

	@Autowired
	RegistrationService registrationService;
	Registration registration;
	
	@RequestMapping("/registration/List")
	public List<Registration> getUser(){
		return (List<Registration>) registrationService.getAllUser();
	}
	
	@GetMapping("/registration/{id}")
	public Registration getSingleUserById(@PathVariable Long id){
		return registrationService.getSingleUserById(id);
	} 
	
	@PostMapping("/register")
	public void addUser(@RequestBody Registration registration) {
		registrationService.addUser(registration);
	}
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> authenticateUser(@RequestBody UserDTO userDTO) {
		
		return ResponseEntity.ok().body(this.registrationService.authenticateUser(userDTO.getUserName(), userDTO.getPassword()));
	}
	
//    @PostMapping("/users")
//    public ResponseEntity<Registration> createOrUpdateUser(Registration registration){
//    	Registration updated = registrationService.createOrUpdateUser(registration);
//        return new ResponseEntity<Registration>(updated, new HttpHeaders(), HttpStatus.OK);
//    }
	
	@RequestMapping(value = "/users/{userName}",method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Registration> getSingleUser(@PathVariable String userName){
		return registrationService.getSingleUser(userName);
	}
		 
	@PutMapping("/users/{id}")
	public ResponseEntity<Registration> updateUser(@PathVariable long id,@RequestBody Registration registration){
		registration.setId(id);
		return ResponseEntity.ok().body(this.registrationService.updateUser(registration));
	}
	
	@DeleteMapping("users/{id}")
	public void deleteUser(@PathVariable Long id) {
		registrationService.deleteUser(id);
	}
	
	@RequestMapping("users/name/{name}")
	public Registration findByUserName(@PathVariable String name) {
		return registrationService.findByUserName(name);
	}
	
	@GetMapping("{name}")
	public long getFindId(@PathVariable String name) {
		return registrationService.getFindId(name);
	}
	
}
