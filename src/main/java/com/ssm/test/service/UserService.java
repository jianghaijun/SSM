package com.ssm.test.service;

import java.util.List;

import com.ssm.test.bean.UserBean;

public interface UserService {
	public List<UserBean> getUserList();
	public int insertUser(UserBean user);
	public int updateUser(UserBean user);
	public int deleteUser(UserBean user);
	public UserBean selectUserById(int id);
}
