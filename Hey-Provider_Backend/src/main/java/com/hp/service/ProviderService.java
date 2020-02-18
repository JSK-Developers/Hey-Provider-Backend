package com.hp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.entity.Provider;
import com.hp.repository.ProviderRepository;

@Service
public class ProviderService{

	@Autowired
	ProviderRepository providerRepository;
	
	public List<Provider> getAllProvider(){
		return (List<Provider>) providerRepository.findAll(); 
	}
	
	public void createProvider(Provider provider) {
		providerRepository.save(provider);
	}
	

}
