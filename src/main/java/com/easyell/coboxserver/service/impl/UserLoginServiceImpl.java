package com.easyell.coboxserver.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.easyell.coboxserver.model.User;
import com.easyell.coboxserver.repositories.UserMapper;
import com.easyell.coboxserver.service.UserLoginService;

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
