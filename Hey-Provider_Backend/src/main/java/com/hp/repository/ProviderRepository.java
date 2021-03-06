package com.hp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hp.entity.Provider;
import com.hp.entity.Registration;

@Repository
public interface ProviderRepository extends CrudRepository<Provider,Long>{

	
		public Provider findByUserName(String Name);
	
	@Query("FROM Provider r WHERE r.userName = :userName")
    public List<Provider> findUser(@Param("userName") String userName);
//	List<Provider> findUser(String userName);
	
	@Query("SELECT r.id FROM Provider r WHERE r.userName = :userName")
	public long findId(@Param("userName") String userName);
	
	
}

