package com.kaunghtetaung.webstore.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaunghtetaung.webstore.domain.Product;

@Controller
public class ProductController {

	@RequestMapping("/products")
	public String list(Model model) {
		Product iphone = new Product("P1234", "iPhone 6S", new BigDecimal(500));
		iphone.setDescription(
				"Applec iPhone 6s smartphone with 4.00-inch 640x1136 display and 8-megapixel rear camera");
		iphone.setCategory("Smartphone");
		iphone.setManufacture("Apple");
		iphone.setUnitsInStock(1000);
		model.addAttribute("product", iphone);

		return "products";
	}

}
