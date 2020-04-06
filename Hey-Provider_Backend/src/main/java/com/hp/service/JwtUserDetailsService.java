package com.hp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.hp.dto.ProviderDTO;
import com.hp.dto.UserDTO;
import com.hp.entity.DAOUser;
import com.hp.entity.Provider;
import com.hp.repository.ProviderRepository;
import com.hp.repository.UserDao;

@Component
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	
	@Autowired
	private ProviderRepository providerRepository;
	


	@Autowired
	private PasswordEncoder bcryptEncoder;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Provider user = providerRepository.findByUserName(userName);
		if (userName == null) {
			throw new UsernameNotFoundException("User not found with username: " + userName);
		}
		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
				new ArrayList<>());
	
	}

	public Provider save(ProviderDTO user) {
		Provider newUser = new Provider();
		newUser.setUserName(user.getUserName());
		newUser.setEmail(user.getEmail());
		newUser.setPhoneNumber(user.getPhoneNumber());
		newUser.setPanNumber(user.getPanNumber());
		newUser.setAdharNumber(user.getAdharNumber());
		newUser.setBankAccountNumber(user.getBankAccountNumber());
		newUser.setIfscCode(user.getIfscCode());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		return providerRepository.save(newUser);
	}
}