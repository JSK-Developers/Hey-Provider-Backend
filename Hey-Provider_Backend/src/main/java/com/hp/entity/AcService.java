package com.hp.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="acService")
public class AcService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public AcService() {
		super();
	}
	
	@Override
	public String toString() {
		return "AcService [id=" + id + ", userName=" + userName + ", date=" + date + ", mobileNumber=" + mobileNumber
				+ ", serviceTime=" + serviceTime + ", address=" + address + ", landmark=" + landmark + ", city=" + city
				+ ", pincode=" + pincode + "]";
	}

	public AcService(Long id, String userName, Date date, long mobileNumber, String time, String address,
			String landmark, String city, long pincode) {
		super();
		this.id = id;
		this.userName = userName;
		this.date = date;
		this.mobileNumber = mobileNumber;
		this.serviceTime = serviceTime;
		this.address = address;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public TimeForServices getserviceTime() {
		return serviceTime;
	}
	public void setserviceTime(TimeForServices serviceTime) {
		this.serviceTime = serviceTime;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	private String userName;
	private Date date;
	private long mobileNumber;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="service_id",referencedColumnName="id")
	private TimeForServices serviceTime;
	private String address;
	private String landmark;
	private String city;
	private long pincode;
	
}
