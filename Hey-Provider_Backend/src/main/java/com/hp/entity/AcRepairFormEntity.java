package com.hp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ac_repair_service")
public class AcRepairFormEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Long number;
	private Date date;
	private String time;
	private String addresss1;
	private String landmark;
	private String city;
	private Long pincode;
	private Long providerid;
	private Long userid;
	private Long end_services_otp;
	private Long window_ac_service;
	private Long split_ac_service;
	private Long less_no_cooling;
	private Long ac_not_starting;
	private Long noise_issue;
	private Long water_leakege;
	private Long total;
	private Long activeStatus;

	
	public AcRepairFormEntity() {
		super();
	}

	public AcRepairFormEntity(Long id, String name, Long number, Date date, String time, String addresss1,
			String landmark, String city, Long pincode,Long total,  Long userid, Long providerid,Long activeStatus,Long end_services_otp,
			Long window_ac_service, Long split_ac_service, Long less_no_cooling, Long ac_not_starting, Long noise_issue,
			Long water_leakege) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.date = date;
		this.time = time;
		this.addresss1 = addresss1;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
		this.providerid = providerid;
		this.userid = userid;
		this.end_services_otp = end_services_otp;
		this.window_ac_service = window_ac_service;
		this.split_ac_service = split_ac_service;
		this.less_no_cooling = less_no_cooling;
		this.ac_not_starting = ac_not_starting;
		this.noise_issue = noise_issue;
		this.water_leakege = water_leakege;
		this.total = total;
		this.activeStatus=activeStatus;
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

	public Long getProviderid() {
		return providerid;
	}

	public void setProviderid(Long providerid) {
		this.providerid = providerid;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Long getEnd_services_otp() {
		return end_services_otp;
	}

	public void setEnd_services_otp(Long end_services_otp) {
		this.end_services_otp = end_services_otp;
	}

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

	public Long getWater_leakege() {
		return water_leakege;
	}

	public void setWater_leakege(Long water_leakege) {
		this.water_leakege = water_leakege;
	}

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	
	public Long getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(Long activeStatus) {
		this.activeStatus=activeStatus;
	}

	@Override
	public String toString() {
		return "AcRepairFormEntity [id=" + id + ", name=" + name + ", number=" + number + ", date=" + date + ", time="
				+ time + ", addresss1=" + addresss1 + ", landmark=" + landmark + ", city=" + city + ", pincode="
				+ pincode + ", providerid=" + providerid + ", userid=" + userid + ", end_services_otp="
				+ end_services_otp + ", window_ac_service=" + window_ac_service + ", split_ac_service="
				+ split_ac_service + ", less_no_cooling=" + less_no_cooling + ", ac_not_starting=" + ac_not_starting
				+ ", noise_issue=" + noise_issue + ", water_leakege=" + water_leakege + ", total=" + total
				+ ", activeStatus=" + activeStatus + "]";
	}
	

}
