package com.ssm.test.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.test.bean.UserBean;
import com.ssm.test.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping(value = "/UserList", method = RequestMethod.GET)
	@ResponseBody
	public UserBean userList() {
		UserBean userbean = new UserBean();
		userbean.setUserName("ÕÅÈý");
		return userbean;
	}
	
	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	@ResponseBody
	public List<UserBean> getUserList(){
		return userService.getUserList();
	}

}
