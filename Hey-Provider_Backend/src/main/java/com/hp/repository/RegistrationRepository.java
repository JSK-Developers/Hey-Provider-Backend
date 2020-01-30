package com.hp.repository;

import org.springframework.data.repository.CrudRepository;

import com.hp.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Long> {
	public Registration findByUserName(String Name);

}
