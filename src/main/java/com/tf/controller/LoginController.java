package com.tf.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tf.entity.User;
import com.tf.service.LoginService;


@RestController
public class LoginController {
	
	private Logger logger = Logger.getLogger(LoginController.class);
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Boolean login(@RequestBody User user) {
		logger.info("Login Service Started");
		Boolean response = loginService.login(user);
		logger.info("Login Service Ended");
		return response;
	}

}
