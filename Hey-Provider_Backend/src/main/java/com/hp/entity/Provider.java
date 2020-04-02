package com.hp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provider")
public class Provider {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	public Provider(Long id, String userName, String email, long phoneNumber, long panNumber, long adharNumber,
			long bankAccountNumber, long confirmBankAccountNumber, String ifscCode, String password,
			String confirmPassword, long activeStatus) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.panNumber = panNumber;
		this.adharNumber = adharNumber;
		this.bankAccountNumber = bankAccountNumber;
		this.confirmBankAccountNumber = confirmBankAccountNumber;
		this.ifscCode = ifscCode;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.activeStatus = activeStatus;
	}



	private String userName;
	private String email;
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

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(long panNumber) {
		this.panNumber = panNumber;
	}

	public long getAdharNumber() {
		return adharNumber;
	}

	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}

	public long getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(long bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public long getConfirmBankAccountNumber() {
		return confirmBankAccountNumber;
	}

	public void setConfirmBankAccountNumber(long confirmBankAccountNumber) {
		this.confirmBankAccountNumber = confirmBankAccountNumber;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
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

	public long getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(long activeStatus) {
		this.activeStatus = activeStatus;
	}



	private long phoneNumber;
	private long panNumber;
	private long adharNumber;
	private long bankAccountNumber;
	private long confirmBankAccountNumber;
	private String ifscCode;
	private String password;
	private String confirmPassword;
	private long activeStatus;

	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
}
