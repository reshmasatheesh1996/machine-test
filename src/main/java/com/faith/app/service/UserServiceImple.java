package com.faith.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.faith.app.dao.UserRepository;
import com.faith.app.entity.User;

@Service
public class UserServiceImple implements IUserService {
	//Field Injection
		@Autowired
		private UserRepository userRepository;
		
		@Override
		public User findUserByNameAndPassword(String userName, String password) {
			User user=userRepository.findUserByUsernameAndPassword(userName, password);
			System.out.println(user);
			
			//condition check
			if(userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
				return user;
			}else {
				return null;
			}
			
		}
}
