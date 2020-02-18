package com.hp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hp.entity.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider,Long>{
	
}

