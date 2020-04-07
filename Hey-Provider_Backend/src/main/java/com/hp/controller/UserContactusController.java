package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hp.entity.UserContactus;
import com.hp.service.UserContactusService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apiContactus")
@RestController
public class UserContactusController {
	@Autowired
	private UserContactusService userContactusService;
	
	@RequestMapping("/Contactus/List")
	public List<UserContactus> getAllDetail(){
		return userContactusService.getAllDetail();
	}
	
	@PostMapping("/createContactusDetail")
	public void addDetailOfUserContactus(@RequestBody UserContactus userContactus) {
		userContactusService.createDetailOfUserContactus(userContactus);
	}


	@GetMapping("/singleContactusDetail/{id}")
	public UserContactus getSingleContactusDetailById(@PathVariable Long id){
		return userContactusService.getSingleUserContactusDetailById(id);
	} 
	
	@DeleteMapping("ContactusDetail/{id}")
	public void deleteUser(@PathVariable Long id) {
		userContactusService.deleteUserContactusDetail(id);
	}
	
	@RequestMapping("ContactusDetail/name/{name}")
	public UserContactus findByUserName(@PathVariable String name) {
		return userContactusService.findByUsername(name);
	}
	
}
