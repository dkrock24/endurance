package org.endurance.app.service;

import java.util.Set;

import org.endurance.app.model.Role;
import org.endurance.app.model.User;

public interface UserService {

	public User findUserByEmail(String email);

	public void saveUser(User user);
	
}