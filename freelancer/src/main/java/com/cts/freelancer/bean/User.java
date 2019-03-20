
	package com.cts.freelancer.bean;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;

	@Entity
	public class  User{
		@Id
		@Column(length=10)
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int userId;
		@Column(nullable=false,length=10)
		private String password;
		@Column(nullable=false,length=10)
		private String firstName;
		@Column(nullable=false,length=10)
		private String lastName;
		@Column(nullable=false,length=10)
		private String emailId;
		@Column(nullable=false,length=10)
		private String phoneNumber;

	public User(){}

	
	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	
	
	
	
}
