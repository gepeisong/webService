package com.gps.dao;

import org.apache.ibatis.annotations.Mapper;

import com.gps.entity.User;
@Mapper
public interface UserDao {
	public User getUserInfo();
}
