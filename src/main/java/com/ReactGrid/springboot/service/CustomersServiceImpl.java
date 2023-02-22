package com.ReactGrid.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ReactGrid.springboot.dao.CustomersRepository;
import com.ReactGrid.springboot.model.Customers;

@Service
public class CustomersServiceImpl implements CustomersService {

	@Autowired
	
	private CustomersRepository customersRepository;

	
	@Override
	public Customers saveCustomer(Customers customer) {
	Customers customer1 = customersRepository.findByCustomersEmail(customer.getCustomersEmail());
		
		if(customer1==null) {
			return customersRepository.save(customer);
	}else {
		return null;
	}

	}
	
	@Override
	public List<Customers> findAll() {
		return  customersRepository.findAll();
	}

	
		@Override
		public Customers update(Customers customer) {
			return customersRepository.save(customer);
			
		}

	@Override
	public Customers deleteCustomers(int id) {
		customersRepository.deleteById(id);
		return null;
	}

}
