package com.cic.controller;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cic.domain.User;
import com.cic.service.UserService;
import com.cic.service.custom.UserAuthenticationService;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;

@RestController
@RequestMapping("/public/users")
@FieldDefaults(level = PRIVATE, makeFinal = true)
@AllArgsConstructor(access = PACKAGE)
final class PublicUsersController {
	
	@NonNull
	UserAuthenticationService authentication;
	@NonNull
	UserService users;

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Sep 17, 2020 - 1:22:21 AM
	 * @return
	 */
	@GetMapping("/info")
	public String info() {
		return "Hello";
	}

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Sep 17, 2020 - 1:22:18 AM
	 * @param username
	 * @param password
	 * @return
	 */
	@PostMapping("/register")
	public String register(@RequestParam("username") final String username,
			@RequestParam("password") final String password) {
		users.save(User.builder().id(username).username(username).password(password).build());

		return login(username, password);
	}

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Sep 17, 2020 - 1:22:08 AM
	 * @param username
	 * @param password
	 * @return
	 */
	@PostMapping("/login")
	public String login(@RequestParam("username") final String username,
			@RequestParam("password") final String password) {
		return authentication.login(username, password)
				.orElseThrow(() -> new RuntimeException("invalid login and/or password"));
	}
}
