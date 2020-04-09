package com.hp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.hp.entity.Provider;
import com.hp.entity.Registration;
import com.hp.exception.ResourceNotFoundException;
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

	public boolean authenticateUser(String userName,String password) {
		Provider user=providerRepository.findByUserName(userName);
			if(password.equals(user.getPassword())) {
				return true;
			}
			return false;
	}
	
	public Optional<Provider> getSingleProvider(Long id) {
		// TODO Auto-generated method stub
		return providerRepository.findById(id);
	}

//	public void updateProvider(Long id, Provider provider) {
//		// TODO Auto-generated method stub
//		providerRepository.save(provider);
//	}
	public Provider getSingleProviderById(Long id) {
		return providerRepository.findById(id).orElse(null);
	}
	public Provider updateProvider(Provider provider) {
		Optional<Provider> user=this.providerRepository.findById(provider.getId());
		
		if(user.isPresent()) {
			Provider providerUpdate=user.get();
			providerUpdate.setId(provider.getId());
			providerUpdate.setEmail(provider.getEmail());
			providerUpdate.setPhoneNumber(provider.getPhoneNumber());
			providerUpdate.setUserName(provider.getUserName());
			providerUpdate.setPanNumber(provider.getPanNumber());
			providerUpdate.setAdharNumber(provider.getAdharNumber());
			providerUpdate.setBankAccountNumber(provider.getBankAccountNumber());
			providerUpdate.setIfscCode(provider.getIfscCode());
			providerUpdate.setPassword(provider.getPassword());
			providerRepository.save(providerUpdate);
			return providerUpdate;
		}else {
			throw new ResourceNotFoundException("User Not Found With This Id: "+provider.getId());
		}
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
	
	public long getFindId(String userName) {
		return providerRepository.findId(userName);
	}

}
