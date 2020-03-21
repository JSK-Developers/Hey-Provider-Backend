package com.hp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserServiceDataEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	public String name;
	public Long number;
	public String date;
	public String time;
	public String addresss1;
	public String landmark;
	public Long pincode;
	public String userName;
	public int total;
}
