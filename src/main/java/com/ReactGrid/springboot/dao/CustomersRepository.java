package com.ReactGrid.springboot.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.ReactGrid.springboot.model.Customers;

public interface CustomersRepository extends JpaRepository<Customers,Integer> {

	Customers findByCustomersEmail(String customersEmail);
}
