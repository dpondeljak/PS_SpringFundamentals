package com.example.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.example.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer tCustomer = new Customer();
		
		tCustomer.setFirstname("Pero");
		tCustomer.setLastname("Marković");
		
		customers.add(tCustomer);
		
		return customers;
	}
}
