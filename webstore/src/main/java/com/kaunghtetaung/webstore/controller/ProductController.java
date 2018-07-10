package com.kaunghtetaung.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaunghtetaung.webstore.repository.ProductRepository;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping("/products")
	public String list(Model model) {
		model.addAttribute("products", productRepository.getAllProducts());

		return "products";
	}

}
