package cn.edu.scau.zhangjiayi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.scau.zhangjiayi.dao.UserMapper;
import cn.edu.scau.zhangjiayi.domain.User;
import cn.edu.scau.zhangjiayi.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserByNameOrIdOrPhone(String value) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByNameOrIdOrPhone(value);
		return user;
	}

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		int res = userMapper.insert(user);
		if(res >= 1) {
			return 1;
		} else
			return 0;
	}

}
