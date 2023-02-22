package com.ReactGrid.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Customers_id")
	private int customersId;

	@Column(name = "Customers_name")
	private String customersName;

	@Column(name = "Customers_email")
	private String customersEmail;

	@Column(name = "Customers_phonenumber")
	private String customersPhonenumber;

	@Column(name = "Customers_location")
	private String customersLocation;

	@Column(name = "Customers_job")
	private String customersJob;

	public Customers() {

	}

	public int getCustomersId() {
		return customersId;
	}

	public void setCustomersId(int customersId) {
		this.customersId = customersId;
	}

	public String getCustomersName() {
		return customersName;
	}

	public void setCustomersName(String customersName) {
		this.customersName = customersName;
	}

	public String getCustomersEmail() {
		return customersEmail;
	}

	public void setCustomersEmail(String customersEmail) {
		this.customersEmail = customersEmail;
	}

	public String getCustomersPhonenumber() {
		return customersPhonenumber;
	}

	public void setCustomersPhonenumber(String customersPhonenumber) {
		this.customersPhonenumber = customersPhonenumber;
	}

	public String getCustomersLocation() {
		return customersLocation;
	}

	public void setCustomersLocation(String customersLocation) {
		this.customersLocation = customersLocation;
	}

	public String getCustomersJob() {
		return customersJob;
	}

	public void setCustomersJob(String customersJob) {
		this.customersJob = customersJob;
	}

	public Customers(int customersId, String customersName, String customersEmail, String customersPhonenumber,
			String customersLocation, String customersJob) {
		super();
		this.customersId = customersId;
		this.customersName = customersName;
		this.customersEmail = customersEmail;
		this.customersPhonenumber = customersPhonenumber;
		this.customersLocation = customersLocation;
		this.customersJob = customersJob;
	}

	@Override
	public String toString() {
		return "Customers [customersId=" + customersId + ", customersName=" + customersName + ", customersEmail="
				+ customersEmail + ", customersPhonenumber=" + customersPhonenumber + ", customersLocation="
				+ customersLocation + ", customersJob=" + customersJob + "]";
	}

	
	
	

}
