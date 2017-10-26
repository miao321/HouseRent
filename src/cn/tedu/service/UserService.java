package cn.tedu.service;

import cn.tedu.entity.User;

public interface UserService {
	void register(User user);
	void login(String name,String password);
}
