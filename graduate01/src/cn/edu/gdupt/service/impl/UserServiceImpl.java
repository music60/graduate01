package cn.edu.gdupt.service.impl;

import java.util.List;

import cn.edu.gdupt.dao.TUserDAO;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.UserService;

/**
 * 会员服务类
 * @author wangjj
 *
 */
public class UserServiceImpl implements UserService {
	
	public TUserDAO gettUserDAO() {
		return tUserDAO;
	}

	public void settUserDAO(TUserDAO tUserDAO) {
		this.tUserDAO = tUserDAO;
	}

	private TUserDAO tUserDAO;
	
	@Override
	public List<TUser> findByUsername(String username,boolean isAccurate) {
		List<TUser> tUsers= tUserDAO.findByUsername(username,isAccurate);
		return tUsers;
	}

	@Override
	public List<TUser> findByEmail(String email,boolean isAccurate) {
		List<TUser> tUsers= tUserDAO.findByEmail(email,isAccurate);
		return tUsers;
	}

	@Override
	public TUser login(String username, String password) {
		return tUserDAO.login(new TUser(username, password));
	}

	@Override
	public TUser register(String username, String password, String email) {
		TUser user = new TUser();
		user.setEmail(email);
		user.setUsername(username);
		user.setPassword(password);
		tUserDAO.save(user);
		return user;
	}

}
