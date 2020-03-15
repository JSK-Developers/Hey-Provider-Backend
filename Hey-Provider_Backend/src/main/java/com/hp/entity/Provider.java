package com.hp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "provider")
public class Provider {
	
	
	@Id
	@GeneratedValue
	private Long id;
	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	private Integer phonenumber;
	
	
	
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}



	


	public Provider(Long id, String userName, String email, String password, String confirmPassword,
			Integer phonenumber) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phonenumber = phonenumber;
	}






	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getConfirmPassword() {
		return confirmPassword;
	}



	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}



	public Integer getPhonenumber() {
		return phonenumber;
	}



	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	
	
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private long id;
//	private String userName;
//	private String name;
////	private long rating;
////	private String serviceType;
//	private String serviceName;
//	private long age;
//
//	public Provider() {
//		super();
//	}
//
//	public Provider(long id, String name, long rating, String serviceType, String serviceName, long age) {
//		super();
//		this.id = id;
//		this.name = name;
////		this.rating = rating;
////		this.serviceType = serviceType;
//		this.serviceName = serviceName;
//		this.age = age;
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
////	public long getRating() {
////		return rating;
////	}
////
////	public void setRating(long rating) {
////		this.rating = rating;
////	}
////
////	public String getServiceType() {
////		return serviceType;
////	}
////
////	public void setServiceType(String serviceType) {
////		this.serviceType = serviceType;
////	}
//
//	public String getServiceName() {
//		return serviceName;
//	}
//
//	public void setServiceName(String serviceName) {
//		this.serviceName = serviceName;
//	}
//
//	public long getAge() {
//		return age;
//	}
//
//	public void setAge(long age) {
//		this.age = age;
//	}

}
