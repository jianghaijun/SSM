package com.ssm.test.dao;

import java.util.List;

import com.ssm.test.bean.UserBean;

public interface UserDao {
	public List<UserBean> getUserList();
	public int insertUser(UserBean user);
	public int updateUser(UserBean user);
	public int deleteUser(UserBean user);
	public UserBean selectUserById(int id);
}
