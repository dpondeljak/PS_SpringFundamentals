package com.example.service;

import java.util.List;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import com.example.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	/* (non-Javadoc)
	 * @see com.example.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
}
