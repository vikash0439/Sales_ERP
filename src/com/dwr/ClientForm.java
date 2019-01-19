package com.dwr;

import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;

public class ClientForm {
	
	private int id;
	private Date date=new Date();
	
	private String bdename;
	@NotEmpty(message = "Enter Name")
	private String name;
	
	private String phone;
	
	private String email;
	
	private String address;
	
	private String remark;
	
	private String company;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBdename() {
		return bdename;
	}
	public void setBdename(String bdename) {
		this.bdename = bdename;
	}
	
}