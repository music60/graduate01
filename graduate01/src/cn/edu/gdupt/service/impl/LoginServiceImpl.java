package cn.edu.gdupt.service.impl;

import cn.edu.gdupt.dao.TUserDAO;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	
	private TUserDAO tUserDao;
	
	@Override
	public TUser login(String username, String password) {
		return tUserDao.login(new TUser(username, password));
		
	}

	
	public void settUserDao(TUserDAO tUserDao) {
		this.tUserDao = tUserDao;
	}
	
}
