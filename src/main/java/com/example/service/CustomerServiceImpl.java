package com.example.service;

import java.util.List;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	public CustomerServiceImpl() {
		
	}

	public CustomerServiceImpl(CustomerRepository pCustomerRepository) {
		this.customerRepository = pCustomerRepository;
	}
	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
}
