package com.home.bmowebsevice.service;

import com.home.bmowebsevice.model.User;

public interface UserService {

	public abstract User saveUser(User user);
	
	public abstract User getUserById(int id);
	
	public abstract  void deleteUserById(int id);
	
	public abstract User updateUser(User user);
}
