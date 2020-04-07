package com.hp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hp.entity.Provider;
import com.hp.entity.UserContactus;
import com.hp.repository.UserContactusRepository;

@Component
public class UserContactusService {

	@Autowired
	private UserContactusRepository userContactusrepository;

	public List<UserContactus> getAllDetail() {
		return (List<UserContactus>) userContactusrepository.findAll();
	}

	public void createDetailOfUserContactus(UserContactus entity) {
		userContactusrepository.save(entity);

	}

	public Optional<UserContactus> getSingleUserDetail(Long id) {
		return userContactusrepository.findById(id);
	}
	
	public UserContactus getSingleUserContactusDetailById(Long id) {
		return userContactusrepository.findById(id).orElse(null);
	}
	
	public void deleteUserContactusDetail(Long id) {
		userContactusrepository.deleteById(id);
	}
	
	public UserContactus findByUsername(String name) {
		// TODO Auto-generated method stub
		return userContactusrepository.findByUsername(name);
	}
	
	
}
