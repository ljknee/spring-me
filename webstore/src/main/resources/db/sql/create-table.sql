DROP TABLE products IF EXISTS;

CREATE TABLE products(
	id VARCHAR(25) PRIMARY KEY,
	name VARCHAR(50),
	description VARCHAR(250),
	unit_price DECIMAL,
	manufacturer VARCHAR(50),
	category VARCHAR(50),
	condition VARCHAR(50),
	units_in_stock BIGINT,
	units_in_order BIGINT,
	discontinued BOOLEAN
);