package com.login;

import org.hibernate.validator.constraints.NotEmpty;

public class loginForm {
	
	@NotEmpty(message="Emailid & Password not matched")
	private String emailid;
	
	@NotEmpty(message="Enter password to login")
	private String password;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
