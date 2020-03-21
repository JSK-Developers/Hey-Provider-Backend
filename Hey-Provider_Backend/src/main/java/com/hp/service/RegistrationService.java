package com.hp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hp.entity.Registration;
import com.hp.exception.ResourceNotFoundException;
import com.hp.repository.RegistrationRepository;

@Component
public class RegistrationService {

	@Autowired
	private RegistrationRepository registrationRepository;

	public List<Registration> getAllUser() {
		return (List<Registration>) registrationRepository.findAll();
	}

	public void addUser(Registration registration) {
		registrationRepository.save(registration);
	}
	public long findById(long id) {
		return registrationRepository.findById(id);
	}

//	
	public List<Registration> getSingleUser(String userName) {
		return registrationRepository.findUser(userName);
	}

	public Registration getSingleUserById(Long id) {
		return registrationRepository.findById(id).orElse(null);
	}
	
	public Registration updateUser(Registration registration) {
		Optional<Registration> user=this.registrationRepository.findById(registration.getId());
		
		if(user.isPresent()) {
			Registration userUpdate=user.get();
			userUpdate.setId(registration.getId());
			userUpdate.setEmail(registration.getEmail());
			userUpdate.setUserName(registration.getUserName());
			userUpdate.setPassword(registration.getPassword());
			userUpdate.setConfirmPassword(registration.getConfirmPassword());
			registrationRepository.save(userUpdate);
			return userUpdate;
		}else {
			throw new ResourceNotFoundException("User Not Found With This Id: "+registration.getId());
		}
	}
	public void deleteUser(Long id) {
		registrationRepository.deleteById(id);
	}

	public Registration findByUserName(String name) {
		return registrationRepository.findByUserName(name);
	}

//    public Registration createOrUpdateUser(Registration entity){
//        Optional<Registration> user = registrationRepository.findById(entity.getId());
//         
//        if(user.isPresent())
//        {
//        	Registration newEntity = user.get();
//            newEntity.setEmail(entity.getEmail());
//            newEntity.setUserName(entity.getUserName());
//            newEntity.setPassword(entity.getPassword());
//            newEntity.setConfirmPassword(entity.getConfirmPassword());
// 
//            newEntity = registrationRepository.save(newEntity);
//             
//            return newEntity;
//        } else {
//            entity = registrationRepository.save(entity);
//             
//            return entity;
//        }
//    }
//	
}
