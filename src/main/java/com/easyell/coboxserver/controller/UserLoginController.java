package com.easyell.coboxserver.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.easyell.coboxserver.service.UserLoginService;

@Controller
@RequestMapping("/userlogin")
public class UserLoginController {

	// @AutowireduserLoginService
	private UserLoginService userLoginService;

	public UserLoginService getUserLoginService() {
		return userLoginService;
	}
	@Autowired
	public void setUserLoginService(UserLoginService userLoginService) {
		this.userLoginService = userLoginService;
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String userLogin(HttpServletRequest request, String userId,
			String password) {
		int result = userLoginService.userlogin(Integer.parseInt(userId), password);
		if (result == 1) {
			return "Loginsuccess";
		}
		return "Loginfailed";
	}

}
