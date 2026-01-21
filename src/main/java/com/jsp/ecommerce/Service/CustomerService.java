package com.jsp.ecommerce.Service;

public interface CustomerService {

	Map<String, Object> getProducts(int page, int size, String sort, boolean desc, String name, String category,
			String lowerRange, String higherRange);
}
