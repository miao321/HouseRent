package cn.tedu.dao;

import cn.tedu.entity.User;

public interface UserDao {
	User findByName(String name);	
	void insert(User user);

}