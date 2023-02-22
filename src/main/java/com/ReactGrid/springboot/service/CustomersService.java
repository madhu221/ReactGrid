package com.ReactGrid.springboot.service;


import java.util.List;

import com.ReactGrid.springboot.model.Customers;

public interface CustomersService {

	public Customers saveCustomer(Customers customer);

	public List<Customers> findAll();
	
	public Customers deleteCustomers(int id);
	
	public Customers update(Customers customer);
	
	//public Customers updateById(int id,Customers customer);
	
}
