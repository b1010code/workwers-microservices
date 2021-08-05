package com.jrd.rhoauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jrd.rhoauth.entity.User;
import com.jrd.rhoauth.service.UserOAuthService;

@RestController
@RequestMapping("/users")
public class UserOAuthController {

	@Autowired
	private UserOAuthService userOAuthService;

	public UserOAuthController(UserOAuthService userOAuthService) {
		this.userOAuthService = userOAuthService;
	}

	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		try {
			User user = this.userOAuthService.findEmail(email);
			return ResponseEntity.ok(user);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}

	}

}
