package cn.edu.scau.zhangjiayi.serviceimpl;

//import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.scau.zhangjiayi.dao.UserMapper;
import cn.edu.scau.zhangjiayi.domain.User;
import cn.edu.scau.zhangjiayi.service.UserService;
@Service
public class UserServiceImpl implements UserService {
//	Logger logger = Logger.getLogger(UserServiceImpl.class);
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
		System.out.println("ִ���� UserService addUser");
//		System.out.println(user.getUsername());
		int res = userMapper.insert(user);
		if(res >= 1) {
			return 1;
		} else
			return 0;
	}

	@Override
	public int login(String name, String pwd) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByNameOrIdOrPhone(name);
		System.out.println(user.getUsername());
		if( user == null) return -2;  //�û�������
		if( pwd.equals(user.getPassword())){
			System.out.println("������ȷ");
			return Integer.valueOf(user.getGrade()); //��¼�ɹ����صȼ� 0 / 1
		}
		return -1; //�������
	}

}
