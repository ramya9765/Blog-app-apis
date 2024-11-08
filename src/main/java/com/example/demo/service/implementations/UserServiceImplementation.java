package com.example.demo.service.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User createUser(User user) {

		return userDao.saveUser(user);
	}

}
