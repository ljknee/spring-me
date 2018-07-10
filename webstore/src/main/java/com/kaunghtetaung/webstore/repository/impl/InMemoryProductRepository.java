package com.kaunghtetaung.webstore.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kaunghtetaung.webstore.domain.Product;
import com.kaunghtetaung.webstore.repository.ProductRepository;

@Repository
public class InMemoryProductRepository implements ProductRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Product> getAllProducts() {
		Map<String, Object> params = new HashMap<String, Object>();

		List<Product> result = jdbcTemplate.query("SELECT * FROM products", params, new ProductMapper());

		return result;
	}

	private static final class ProductMapper implements RowMapper<Product> {
		
		public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
			Product product = new Product();
			product.setProductId(rs.getString("id"));
			product.setName(rs.getString("name"));
			product.setDescription(rs.getString("description"));
			product.setUnitPrice(rs.getBigDecimal("unit_price"));
			product.setManufacturer(rs.getString("manufacturer"));
			product.setCategory(rs.getString("category"));
			product.setCondition(rs.getString("category"));
			product.setUnitsInStock(rs.getLong("units_in_stock"));
			product.setUnitsInOrder(rs.getLong("units_in_order"));
			product.setDiscontinued(rs.getBoolean("discontinued"));
			return product;
		}

	}

	@Override
	public void updateStock(String productId, long noOfUnits) {
		
		String sql = "UPDATE products SET units_in_stock = :unitsInStock WHERE id = :id";
		Map<String, Object> params = new HashMap<>();
		
		params.put("unitsInStock", noOfUnits);
		params.put("id", productId);
		
		jdbcTemplate.update(sql, params);
		
	}

}
