package com.jeasyell.easyell.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jeasyell.easyell.model.User;
import com.jeasyell.easyell.repositories.UserMapper;
import com.jeasyell.easyell.service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	private UserMapper userMapper;

	public UserMapper getUserMapper() {
		return userMapper;
	}

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public int userlogin(int userId, String password) {
		int result = 0;
		User user = userMapper.selectByPrimaryKey(userId);

		if (user != null) {
			if (!user.getPassword().equals(password)) {
				result = -2;
			} else {
				result = 1;
			}
		} else {
			result = -1;
		}

		return result;
	}
}
