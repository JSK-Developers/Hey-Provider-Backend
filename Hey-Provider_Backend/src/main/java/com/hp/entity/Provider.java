package com.hp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="provider")
public class Provider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private long rating;
	private String serviceType;
	private String serviceName;
	private long age;
	
	
	public Provider() {
		super();
	}
	public Provider(long id, String name, long rating, String serviceType, String serviceName, long age) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.serviceType = serviceType;
		this.serviceName = serviceName;
		this.age = age;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRating() {
		return rating;
	}
	public void setRating(long rating) {
		this.rating = rating;
	}
	public String getServiceType() {
		return serviceType;
	}
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + ", rating=" + rating + ", serviceType=" + serviceType
				+ ", serviceName=" + serviceName + ", age=" + age + "]";
	}
	
	

}
