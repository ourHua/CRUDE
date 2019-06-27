package cn.cdtu.CDTUE.service;

import cn.cdtu.CDTUE.pojo.User;

public interface UserService {

	String login(User user);

	String regist(User user);

}
