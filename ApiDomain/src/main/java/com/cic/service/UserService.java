package com.cic.service;
import java.util.Optional;


import com.cic.domain.User;

public interface UserService {
	  User save(User user);

	  Optional<User> find(String id);

	  Optional<User> findByUsername(String username);
}
