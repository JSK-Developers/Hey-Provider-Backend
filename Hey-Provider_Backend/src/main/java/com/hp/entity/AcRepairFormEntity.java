package com.hp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ac_repair_service")
public class AcRepairFormEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String number;
	private String date;
	private String time;
	private String addresss1;
	private String addresss2;
	private String city;
	private String state;
	private String pincode;
	
	
	@Override
	public String toString() {
		return "AcRepairFormEntity [id=" + id + ", name=" + name + ", number=" + number + ", date=" + date + ", time="
				+ time + ", addresss1=" + addresss1 + ", addresss2=" + addresss2 + ", city=" + city + ", state=" + state
				+ ", pincode=" + pincode + "]";
	}
	public AcRepairFormEntity() {
		super();
	}
	public AcRepairFormEntity(Long id, String name, String number, String date, String time, String addresss1,
			String addresss2, String city, String state, String pincode) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.date = date;
		this.time = time;
		this.addresss1 = addresss1;
		this.addresss2 = addresss2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAddresss1() {
		return addresss1;
	}
	public void setAddresss1(String addresss1) {
		this.addresss1 = addresss1;
	}
	public String getAddresss2() {
		return addresss2;
	}
	public void setAddresss2(String addresss2) {
		this.addresss2 = addresss2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	

}
