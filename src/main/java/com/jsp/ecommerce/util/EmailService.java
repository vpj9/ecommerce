package com.jsp.ecommerce.util;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EmailService {

	private final JavaMailSender mailSender;

	@Async
	public void sendOtpEmail(Integer otp, String name, String email) {
//		MimeMessage message = mailSender.createMimeMessage();
//		MimeMessageHelper helper = new MimeMessageHelper(message);
//		try {
//			helper.setFrom("admin@ecom.com", "Ecommerce Application");
//			helper.setTo(email);
//			helper.setSubject("Otp for Account Creation - Merchant");
//			helper.setText("Hello " + name + " Your OTP for Creating Account with us is " + otp + "", true);
//			mailSender.send(message);
//		} catch (Exception e) {
//			throw new IllegalArgumentException("Failed to Send Email");
//		}

	    if (email == null || email.isBlank()) {
	        throw new IllegalArgumentException("Email is missing");
	    }

	    try {
	        MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message, true);

	        helper.setFrom("yourgmail@gmail.com", "Ecommerce Application");
	        helper.setTo(email);
	        helper.setSubject("OTP for Account Creation");
	        helper.setText(
	            "Hello " + name + ",<br><br>Your OTP is <b>" + otp + "</b>",
	            true
	        );

	        mailSender.send(message);

	    } catch (Exception e) {
	        e.printStackTrace();
	        throw new IllegalArgumentException("Failed to Send Email", e);
	    }
	}

	

}
