package cn.edu.scau.zhangjiayi.service;

import cn.edu.scau.zhangjiayi.domain.User;

public interface UserService {
	User getUserByNameOrIdOrPhone(String value);
	int addUser(User user);
	int login(String name, String pwd);
}
