package com.tf.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tf.entity.QuoteResponse;
import com.tf.entity.User;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	
	
	@Override
	public Boolean login(User user) {
		
		RestTemplate restTemplate = new RestTemplate();
		QuoteResponse result =restTemplate.postForObject("http://localhost:8090/login", user, QuoteResponse.class);
		if(result != null) {
			if(result.getMessage().equalsIgnoreCase("Successful")) {
				return Boolean.TRUE;
			}
			return Boolean.FALSE;
		}
		return Boolean.FALSE;
	}

}
