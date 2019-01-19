package com.gem;

import java.time.LocalDate;

import org.hibernate.validator.constraints.NotEmpty;

public class GemForm {
	
	private int id;
	LocalDate d=LocalDate.now();
	private String bdename;
	@NotEmpty(message = "Please Enter Order ID")
	private String gemorderid;
	private String ordersummary;
	private String contactno;
	private String date;
	private String name;
	private String contact1;
	private String contact2;
	private String contactperson;
	private String add1;
	private String city;
	private String state;
	private String email;
	private String pin;
	private String invoiceno;
	private String invoicedate;
	private String courier;
	private String dispatch;
	private String awb;
	private String mode;
	private String dstatus;
	private String ddate;
	private String confirm;
	private String accepted;
	private String recieved;
	private String pmode;
	private String precieveddate;
	private String status;
	private String no;
	private String amount;
	private String remark;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public LocalDate getD() {
		return d;
	}
	public void setD(LocalDate d) {
		this.d = d;
	}
	public String getBdename() {
		return bdename;
	}
	public void setBdename(String bdename) {
		this.bdename = bdename;
	}
	public String getGemorderid() {
		return gemorderid;
	}
	public void setGemorderid(String gemorderid) {
		this.gemorderid = gemorderid;
	}
	public String getOrdersummary() {
		return ordersummary;
	}
	public void setOrdersummary(String ordersummary) {
		this.ordersummary = ordersummary;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact1() {
		return contact1;
	}
	public void setContact1(String contact1) {
		this.contact1 = contact1;
	}
	public String getContact2() {
		return contact2;
	}
	public void setContact2(String contact2) {
		this.contact2 = contact2;
	}
	public String getContactperson() {
		return contactperson;
	}
	public void setContactperson(String contactperson) {
		this.contactperson = contactperson;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public String getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(String invoicedate) {
		this.invoicedate = invoicedate;
	}
	public String getCourier() {
		return courier;
	}
	public void setCourier(String courier) {
		this.courier = courier;
	}
	public String getDispatch() {
		return dispatch;
	}
	public void setDispatch(String dispatch) {
		this.dispatch = dispatch;
	}
	public String getAwb() {
		return awb;
	}
	public void setAwb(String awb) {
		this.awb = awb;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public String getDstatus() {
		return dstatus;
	}
	public void setDstatus(String dstatus) {
		this.dstatus = dstatus;
	}
	public String getDdate() {
		return ddate;
	}
	public void setDdate(String ddate) {
		this.ddate = ddate;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
	public String getAccepted() {
		return accepted;
	}
	public void setAccepted(String accepted) {
		this.accepted = accepted;
	}
	public String getRecieved() {
		return recieved;
	}
	public void setRecieved(String recieved) {
		this.recieved = recieved;
	}
	public String getPmode() {
		return pmode;
	}
	public void setPmode(String pmode) {
		this.pmode = pmode;
	}
	public String getPrecieveddate() {
		return precieveddate;
	}
	public void setPrecieveddate(String precieveddate) {
		this.precieveddate = precieveddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}	
}
