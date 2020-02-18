package com.hp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.entity.Provider;
import com.hp.service.ProviderService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/Provider")
public class ProviderCotroller {

	@Autowired
	ProviderService providerService;
	
	@RequestMapping("/ListProvider")
	public List<Provider> getAllUser(){
		return (List<Provider>) providerService.getAllProvider();
	}
	
	@PostMapping("/save")
	public void addProvider(@RequestBody Provider provider) {
		providerService.createProvider(provider);
	}
	
}
