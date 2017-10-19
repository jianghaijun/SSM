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

}
