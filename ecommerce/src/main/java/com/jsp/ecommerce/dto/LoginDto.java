package com.jsp.ecommerce.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginDto {
	@NotEmpty(message="email is not present")
	private String email;
	@NotEmpty(message="password is not present")
	private String password;
}
