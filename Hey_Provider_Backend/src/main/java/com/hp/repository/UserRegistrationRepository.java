package com.hp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hp.entity.UserRegistration;

public interface UserRegistrationRepository extends  JpaRepository<UserRegistration, Long> {

}
