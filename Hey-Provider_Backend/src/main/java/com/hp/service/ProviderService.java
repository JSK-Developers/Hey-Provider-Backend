package com.hp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.hp.entity.Provider;
import com.hp.entity.Registration;
import com.hp.repository.ProviderRepository;

@Component
public class ProviderService{

	@Autowired
	ProviderRepository providerRepository;
	
	public List<Provider> getAllProvider(){
		return (List<Provider>) providerRepository.findAll(); 
	}
	
	public void createProvider(Provider provider) {
		providerRepository.save(provider);
	}

	public Optional<Provider> getSingleProvider(Long id) {
		// TODO Auto-generated method stub
		return providerRepository.findById(id);
	}

	public void updateProvider(Long id, Provider provider) {
		// TODO Auto-generated method stub
		providerRepository.save(provider);
	}

	public void deleteProvider(Long id) {
		// TODO Auto-generated method stub
		providerRepository.deleteById(id);
	}

	public Provider findByProviderName(String name) {
		// TODO Auto-generated method stub
		return providerRepository.findByUserName(name);
	}

	public List<Provider> getSingleProvider(String userName) {
		// TODO Auto-generated method stub
		return providerRepository.findUser(userName);
	}
	

}
