package com.jsp.ecommerce.Exception;

public class OutOfStockException extends RuntimeException {
	public OutOfStockException(String message) {
		super(message);
	}
}
