package cn.edu.gdupt.service;

import cn.edu.gdupt.model.TUser;

public interface LoginService {
	
	TUser login(String username,String password);
}
