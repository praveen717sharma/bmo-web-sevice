package com.home.bmowebsevice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.bmowebsevice.exception.TradeNotFoundException;
import com.home.bmowebsevice.exception.UserNotFoundException;
import com.home.bmowebsevice.model.User;
import com.home.bmowebsevice.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User saveUser(User user) {
	//Integer id=user.getUserId();
	User uUser= userRepo.save(user);
		return uUser;
	}

	@Override
	public User getUserById(int id) {
		Optional<User> uUser=userRepo.findById(id);
		return uUser.get();
	}

	@Override
	public void deleteUserById(int id) {
		
		//Optional<User> uUser = userRepo.findById(id);
		userRepo.deleteById(id);
	}

	@Override
	public User updateUser(User newUser) {
		
		Integer id = newUser.getUserId();
		User existingUser=null;
		
		Optional<User> oUser=userRepo.findById(id);
		if(oUser.isPresent()) {
			
			existingUser=oUser.get();
			
			existingUser.setUserId(newUser.getUserId());
			existingUser.setUserName(newUser.getUserName());
			existingUser.setUserType(newUser.getUserType());
			existingUser.setUserAddress(newUser.getUserAddress());
		}else {
			throw new UserNotFoundException("User not found");
		}
		return newUser;
	}

}
