package cn.cdtu.CDTUE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.cdtu.CDTUE.pojo.User;
import cn.cdtu.CDTUE.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("/login")
	public String login(User user) {
		String result = userService.login(user);
		return result;
	}
}
