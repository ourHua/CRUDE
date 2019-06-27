package cn.cdtu.CDTUE.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.cdtu.CDTUE.dao.UserMapper;
import cn.cdtu.CDTUE.pojo.User;
import cn.cdtu.CDTUE.service.UserService;
import cn.cdtu.CDTUE.util.Tools;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public String login(User user) {
		
		// 密码加密
		user.setPassword(Tools.md5(user.getPassword()));
		
		// 根据用户名查找用户
		User u = userMapper.selectByUsername(user.getUsername());
		
		// 如果 u为空
		if(u == null) return "username not found";
		
		// u 不为空
		if(u.getPassword().equals(user.getPassword())) 
			return "success"; 
		else 
			return "password is error";
		
	}
	@Override
	public String regist(User user) {
		userMapper.insertSelective(user);
		return "注册成功";
	}

}
