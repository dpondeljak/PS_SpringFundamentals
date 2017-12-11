package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {


	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer tCustomer = new Customer();
		
		tCustomer.setFirstname("Pero");
		tCustomer.setLastname("peric");
		
		customers.add(tCustomer);
		
		return customers;
	}
}
