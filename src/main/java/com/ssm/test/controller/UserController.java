package com.ssm.test.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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

	@RequestMapping(value = "/UserList", method = RequestMethod.POST, produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public UserBean userList(HttpServletRequest request) {
		System.out.println(request.getParameter("userName") + "-----userName-------" + "------passWord----" + request.getParameter("passWord"));
		UserBean userbean = new UserBean();
		userbean.setUserName("张三");
		return userbean;
	}
	
	@RequestMapping(value = "/getUserList", method = RequestMethod.GET)
	@ResponseBody
	public List<UserBean> getUserList(){
		return userService.getUserList();
	}
	
	@RequestMapping(value = "/insertUser", method = RequestMethod.POST, produces={"application/json;charset=UTF-8"})
	@ResponseBody
	public int insertUser(@RequestBody UserBean user) {
		return userService.insertUser(user);
	}
	
	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	@ResponseBody
	public int updatetUser() {
		UserBean user = new UserBean();
		user.setId(4);
		user.setUserName("赵六六");
		return userService.updateUser(user);
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	@ResponseBody
	public int deleteUser() {
		UserBean user = new UserBean();
		user.setId(4);
		return userService.deleteUser(user);
	}
	
	@RequestMapping(value = "/selectUserById", method = RequestMethod.GET)
	@ResponseBody
	public UserBean selectUserById(int id) {
		return userService.selectUserById(id);
	}

}
