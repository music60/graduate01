package cn.edu.gdupt.action;

import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.LoginService;
import cn.edu.gdupt.service.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/***
 * 用户登录
 * @author wangjj
 * 2014-02-18
 *
 */
public class LoginAction implements Action {

	private String username;
	private String password;
	private UserService userService;
	private TUser tUser;
	
	public TUser gettUser() {
		return tUser;
	}


	public void settUser(TUser tUser) {
		this.tUser = tUser;
	}


	@Override
	public String execute() throws Exception {
		tUser =userService.login(username, password);
		ActionContext.getContext().getSession().put("tUser",tUser);
		if (tUser!=null) {
			return "SUCCESS";
		}
		return "ERROR"; 
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	

}
