package com.hp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "User-contactus-detail")
public class UserContactus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@Email
	private String emailAdressOfUser;
	private String subject;
	private String message;

	public UserContactus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserContactus(long id, String name, @Email String emailAdressOfUser, String subject, String message) {
		super();
		this.id = id;
		this.name = name;
		this.emailAdressOfUser = emailAdressOfUser;
		this.subject = subject;
		this.message = message;
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

	public String getEmailOfUser() {
		return emailAdressOfUser;
	}

	public void setEmailOfUser(String emailOfUser) {
		this.emailAdressOfUser = emailOfUser;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
