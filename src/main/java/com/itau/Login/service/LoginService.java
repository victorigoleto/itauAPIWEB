package com.itau.Login.service;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itau.Login.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository repository;
	

}



