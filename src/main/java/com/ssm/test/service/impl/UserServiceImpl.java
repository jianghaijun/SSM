package com.ssm.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.test.bean.UserBean;
import com.ssm.test.dao.UserDao;
import com.ssm.test.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	@Override
	public List<UserBean> getUserList() {
		return userDao.getUserList();
	}

	@Override
	public int insertUser(UserBean user) {
		return userDao.insertUser(user);
	}

	@Override
	public int updateUser(UserBean user) {
		return userDao.updateUser(user);
	}

	@Override
	public int deleteUser(UserBean user) {
		return userDao.deleteUser(user);
	}

	@Override
	public UserBean selectUserById(int id) {
		return userDao.selectUserById(id);
	}

}
