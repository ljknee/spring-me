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

import com.kaunghtetaung.webstore.domain.Customer;
import com.kaunghtetaung.webstore.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public List<Customer> getAllCustomers() {
		Map<String, Object> params = new HashMap<String, Object>();

		List<Customer> result = jdbcTemplate.query("SELECT * FROM customers", params, new CustomerMapper());

		return result;
	}

	private static final class CustomerMapper implements RowMapper<Customer> {

		public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
			Customer customer = new Customer();
			customer.setCustomerId(rs.getString("id"));
			customer.setName(rs.getString("customer_name"));
			customer.setNoOfOrdersMade(rs.getLong("no_order_made"));
			customer.setAddress(rs.getString("customer_address"));

			return customer;
		}

	}

}
