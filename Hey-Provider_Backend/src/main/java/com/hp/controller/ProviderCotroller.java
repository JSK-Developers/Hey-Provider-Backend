package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

import com.hp.entity.Provider;
import com.hp.service.ProviderService;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/apiProvider")
@RestController
public class ProviderCotroller {

	@Autowired
	ProviderService providerService;
//	
//	@Autowired
//	private Provider provider;
	
	@RequestMapping("/provider/List")
	public List<Provider> getAllUser(){
		return (List<Provider>) providerService.getAllProvider();
	}
	
	@PostMapping("/provider")
	public void addProvider(@RequestBody Provider provider) {
		providerService.createProvider(provider);
	}
	
	@RequestMapping(value = "/provider/{userName}",method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Provider> getSingleUser(@PathVariable String userName){
		return providerService.getSingleProvider(userName);
	}
		 
	@PutMapping("/provider/{id}")
	public void updateUser(@RequestBody Provider provider,@PathVariable Long id) {
		providerService.updateProvider(id, provider);
	}
	
	@DeleteMapping("provider/{id}")
	public void deleteUser(@PathVariable Long id) {
		providerService.deleteProvider(id);
	}
	
	@RequestMapping("provider/name/{name}")
	public Provider findByUserName(@PathVariable String name) {
		return providerService.findByProviderName(name);
	}
	
	
	
}
