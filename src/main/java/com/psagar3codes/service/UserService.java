package com.psagar3codes.service;

import com.psagar3codes.binding.LoginForm;
import com.psagar3codes.binding.SignUpForm;
import com.psagar3codes.binding.UnlockForm;

public interface UserService {
	
	public String login(LoginForm form);
	
	public boolean signUp(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
	
	public String forgotPassword(String email);

}
