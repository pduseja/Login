package com.tf.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tf.entity.User;
import com.tf.repository.UserRepository;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public Boolean login(User user) {
		List<User> users = userRepo.getUser(user.getUserName());
		if(users.size()==1) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

}
