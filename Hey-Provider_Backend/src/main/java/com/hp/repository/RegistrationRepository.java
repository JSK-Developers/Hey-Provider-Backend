package com.hp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.hp.entity.Registration;

public interface RegistrationRepository extends CrudRepository<Registration, Long> {
	public Registration findByUserName(String Name);

//	 @Query("FROM register r WHERE r.lastName =: lastName and r.password =: password")
//	    public List<Registration> findUser(@Param("lastName") String lastName , @Param("password") String password);
	 @Query("FROM Registration r WHERE r.userName = :userName")
    public List<Registration> findUser(@Param("userName") String userName);
	
	 @Query("FROM Registration r WHERE r.id = :id")
	    public long findById(@Param("id") long id);
}
