package com.psagar3codes.service;

import com.psagar3codes.binding.LoginForm;
import com.psagar3codes.binding.SignUpForm;
import com.psagar3codes.binding.UnlockForm;

public class UserServiceImpl implements UserService {

	@Override
	public String login(LoginForm form) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean signUp(SignUpForm form) {
		
		//TODO: generate random password and set to object
		
		//TODO: set account status as locked
		
		//TODO: Insert record
		
		//TODO: Send Email to unlock the account
		 
		return false;
	}

	@Override
	public boolean unlockAccount(UnlockForm form) {
		// TODO Auto-generated method stub
		return false;
	}
  
	@Override
	public String forgotPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
