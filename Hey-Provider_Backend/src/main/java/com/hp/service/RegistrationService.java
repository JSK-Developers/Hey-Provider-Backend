package com.hp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hp.entity.Registration;
import com.hp.repository.RegistrationRepository;

@Component
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;
	
	public List<Registration> getAllUser(){
		return(List<Registration>) registrationRepository.findAll();
	}
	public void addUser(Registration registration) {
		registrationRepository.save(registration);
	}
	public Optional<Registration> getSingleUser(Long id){
		return registrationRepository.findById(id);
	} 
	public void updateUser(Long id,Registration registration) {
		registrationRepository.save(registration);
	}
	public void deleteUser(Long id) {
		registrationRepository.deleteById(id);
	}
	public Registration findByUserName(String name) {
		return registrationRepository.findByUserName(name);
	}
	
	
}
