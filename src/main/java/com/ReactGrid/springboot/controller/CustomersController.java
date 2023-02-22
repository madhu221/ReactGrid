package com.ReactGrid.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ReactGrid.springboot.model.Customers;
import com.ReactGrid.springboot.service.CustomersService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value = "/Customers")
public class CustomersController {

	@Autowired
	private CustomersService customersService;

	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST)
	public ResponseEntity<Object> saveCustomer(@RequestBody Customers customer) {
		customer = customersService.saveCustomer(customer);
		return new ResponseEntity<>("Customer is created successfully with Id = " + customer.getCustomersId(),
				HttpStatus.CREATED);
	}

	@RequestMapping(value = "/getCustomer", method = RequestMethod.GET)
	public ResponseEntity<Object> getCustomer() {
		List<Customers> customerList = customersService.findAll();
		return new ResponseEntity<>(customerList, HttpStatus.OK);
	
	}
	
//	@RequestMapping(value ="/putCustomer/{id}",method=RequestMethod.PUT)
//	public ResponseEntity<Object>UpdateCustomer(@PathVariable int id,@RequestBody Customers customer){
//	 
//		return new ResponseEntity<>(customersService.updateById(id, customer),HttpStatus.OK);
//	}
	
	@RequestMapping(value ="/putCustomer",method=RequestMethod.PUT)
	public ResponseEntity<Customers>UpdateCustomer(@RequestBody Customers customer){
     	 Customers 	customers =customersService.update(customer);
		return new ResponseEntity<>(customers,HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteCustomer/{id}",method=RequestMethod.DELETE)
	public ResponseEntity<Customers>deleteCustomer(@PathVariable int id){
		Customers customer = customersService.deleteCustomers(id);
		return new ResponseEntity<>(customer,HttpStatus.OK); 
	}
}
