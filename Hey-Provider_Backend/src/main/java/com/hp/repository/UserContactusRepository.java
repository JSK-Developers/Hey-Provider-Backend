package com.hp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hp.entity.UserContactus;

@Repository
public interface UserContactusRepository extends CrudRepository<UserContactus, Long> {

	UserContactus findByUsername(String username);
}
