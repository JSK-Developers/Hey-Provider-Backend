package com.hp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hp.entity.TimeForServices;


public interface TimeForServicesRepository extends CrudRepository<TimeForServices, Long> {

//	@Query("SELECT serviceTime FROM TimeForServices")
//	List<TimeForServices> findAll();
}
