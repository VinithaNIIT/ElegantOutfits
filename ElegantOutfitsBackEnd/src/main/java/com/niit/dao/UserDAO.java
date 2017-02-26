package com.niit.dao;

import com.niit.model.User;

public interface UserDAO {
	public boolean validate(String username,String password);
	public int addUser(User user);
}
