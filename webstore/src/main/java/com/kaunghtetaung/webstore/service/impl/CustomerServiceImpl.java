package com.kaunghtetaung.webstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaunghtetaung.webstore.domain.Customer;
import com.kaunghtetaung.webstore.repository.CustomerRepository;
import com.kaunghtetaung.webstore.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers = customerRepository.getAllCustomers();

		return allCustomers;
	}

}
