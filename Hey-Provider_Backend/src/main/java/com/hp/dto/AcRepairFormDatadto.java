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
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date date;
	
	@JsonProperty(value = "time")
	private String time;
	
	@JsonProperty(value = "addresss1")
	private String addresss1;
	
	@JsonProperty(value = "end_services_otp")
	private Long end_services_otp;
	
	public Long getEnd_services_otp() {
		return end_services_otp;
	}

	public void setEnd_services_otp(Long end_services_otp) {
		this.end_services_otp = end_services_otp;
	}

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

	@JsonProperty(value="window_ac_service")
	private Long window_ac_service;
	
	@JsonProperty(value="split_ac_service")
	private Long split_ac_service;
	
	@JsonProperty(value="less_no_cooling")
	private Long less_no_cooling;
	
	@JsonProperty(value="ac_not_starting")
	private Long ac_not_starting;
	
	@JsonProperty(value="noise_issue")
	private Long noise_issue;
	
	@JsonProperty(value="water_leakege")
	private Long water_leakege;
	
	public Long getWindow_ac_service() {
		return window_ac_service;
	}

	public void setWindow_ac_service(Long window_ac_service) {
		this.window_ac_service = window_ac_service;
	}

	public Long getSplit_ac_service() {
		return split_ac_service;
	}

	public void setSplit_ac_service(Long split_ac_service) {
		this.split_ac_service = split_ac_service;
	}

	public Long getLess_no_cooling() {
		return less_no_cooling;
	}

	public void setLess_no_cooling(Long less_no_cooling) {
		this.less_no_cooling = less_no_cooling;
	}

	public Long getAc_not_starting() {
		return ac_not_starting;
	}

	public void setAc_not_starting(Long ac_not_starting) {
		this.ac_not_starting = ac_not_starting;
	}

	public Long getNoise_issue() {
		return noise_issue;
	}

	public void setNoise_issue(Long noise_issue) {
		this.noise_issue = noise_issue;
	}

	public Long getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Long activeStatus) {
		this.activeStatus = activeStatus;
	}
	
	public AcRepairFormDatadto() {
		super();
	}

	public AcRepairFormDatadto(Long id,String name, Long number, Date date, String time, String addresss1,  Long end_services_otp,String landmark,
			String city, Long pincode, Long total, String userName, String providerName, Long activeStatus) {
		super();
		this.id=id;
		this.name = name;
		this.number = number;
		this.date = date;
		this.time = time;
		this.addresss1 = addresss1;
		this.end_services_otp = end_services_otp;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
		this.userName = userName;
		this.total = total;
		this.providerName=providerName;
		this.activeStatus=activeStatus;
	}

	public AcRepairFormDatadto(Long id,String name, Long number, Date date, String time, String addresss1, String landmark,
			String city, Long pincode, Long total, String userName, String providerName, Long activeStatus, Long end_services_otp, Long window_ac_service, 
			Long split_ac_service, Long less_no_cooling, Long ac_not_starting, Long noise_issue, Long water_leakege) {
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
		this.end_services_otp=end_services_otp;
		this.window_ac_service=window_ac_service;
		this.split_ac_service=split_ac_service;
		this.less_no_cooling=less_no_cooling;
		this.ac_not_starting=ac_not_starting;
		this.noise_issue=noise_issue;
		this.water_leakege=water_leakege;
		
	}

	
	public Long getWater_leakege() {
		return water_leakege;
	}

	public void setWater_leakege(Long water_leakege) {
		this.water_leakege = water_leakege;
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
