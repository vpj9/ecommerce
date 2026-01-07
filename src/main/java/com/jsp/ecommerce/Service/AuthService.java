package com.jsp.ecommerce.Service;

import java.util.Map;

import com.jsp.ecommerce.dto.LoginDto;

public interface AuthService {
	Map<String, Object> login(String email, String password);

	Map<String, Object> viewUser(String email);

	Map<String, Object> updatePassword(String email, String oldPassword, String newPassword);

	

}
