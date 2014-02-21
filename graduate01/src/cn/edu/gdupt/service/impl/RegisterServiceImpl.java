package cn.edu.gdupt.service.impl;

import cn.edu.gdupt.dao.TUserDAO;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {
	
	private TUserDAO tUserDAO;
	
	public TUserDAO gettUserDAO() {
		return tUserDAO;
	}

	public void settUserDAO(TUserDAO tUserDAO) {
		this.tUserDAO = tUserDAO;
	}

	@Override
	public void register(String username, String password, String email) {
		TUser user = new TUser();
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		tUserDAO.save(user);
	}

}
