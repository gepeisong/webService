package com.gps.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gps.dao.UserDao;
import com.gps.entity.User;
import com.gps.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	public User getUserInfo() {
		// TODO Auto-generated method stub
		return userDao.getUserInfo();
	}

}
