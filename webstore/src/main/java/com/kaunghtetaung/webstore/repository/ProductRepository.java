package com.kaunghtetaung.webstore.repository;

import java.util.List;

import com.kaunghtetaung.webstore.domain.Product;

public interface ProductRepository {
	
	List <Product> getAllProducts();
	void updateStock (String productId, long noOfUnits);

}
