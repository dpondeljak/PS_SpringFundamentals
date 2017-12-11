package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	
	/**
	 * Autowired kroz member injection 
	 */
	//@Autowired
	private CustomerRepository customerRepository;
	
	/**
	 * Autowired kroz constructor injection
	 * @param customerRepository
	 */
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("autowired kroz constructor injection");
		this.customerRepository = customerRepository;	
	}
	
	/**
	 * Autowired kroz setter injection
	 * @param customerRepository
	 */
	//@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("autowired kroz setter injection");
		this.customerRepository = customerRepository;
	}

	
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
