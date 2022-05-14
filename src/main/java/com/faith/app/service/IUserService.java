package com.faith.app.service;

import com.faith.app.entity.User;

public interface IUserService {

	//custom method --in UserRepository
	public User findUserByNameAndPassword(String userName,String password);
}
