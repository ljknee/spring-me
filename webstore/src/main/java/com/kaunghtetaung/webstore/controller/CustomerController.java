package com.kaunghtetaung.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaunghtetaung.webstore.repository.CustomerRepository;
import com.kaunghtetaung.webstore.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public String list(Model model) {
		model.addAttribute("customers", customerRepository.getAllCustomers());

		return "customers";
	}

	@RequestMapping("/update/customer")
	public String updateStock(Model model) {
		customerService.getAllCustomers();

		return "redirect:/customers";
	}

}
