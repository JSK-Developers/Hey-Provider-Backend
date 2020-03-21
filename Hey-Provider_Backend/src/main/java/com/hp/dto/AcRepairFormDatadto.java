package com.hp.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AcRepairFormDatadto {
	
	@JsonProperty(value="id")
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty(value = "name")
	private String name;
	
	@JsonProperty(value = "number")
	private Long number;
	
	@JsonProperty(value = "date")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date date;
	
	@JsonProperty(value = "time")
	private String time;
	
	@JsonProperty(value = "addresss1")
	private String addresss1;
	
	@JsonProperty(value = "landmark")
	private String landmark;
	
	@JsonProperty(value = "city")
	private String city;
	
	@JsonProperty(value = "pincode")
	private Long pincode;
	
	@JsonProperty(value = "userName")
	private String userName;
	
	@JsonProperty(value = "providerName")
	private String providerName;
	
	@JsonProperty(value="activeStatus")
	private Long activeStatus;

	public Long getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Long activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	public AcRepairFormDatadto() {
		super();
	}

	public AcRepairFormDatadto(Long id,String name, Long number, Date date, String time, String addresss1, String landmark,
			String city, Long pincode, Long total, String userName, String providerName, Long activeStatus) {
		super();
		this.id=id;
		this.name = name;
		this.number = number;
		this.date = date;
		this.time = time;
		this.addresss1 = addresss1;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
		this.userName = userName;
		this.total = total;
		this.providerName=providerName;
		this.activeStatus=activeStatus;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	@JsonProperty(value = "total")
	private Long total;

}
