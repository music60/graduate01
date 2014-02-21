package cn.edu.gdupt.action;

import cn.edu.gdupt.service.RegisterService;
import cn.edu.gdupt.service.UserService;

import com.opensymphony.xwork2.Action;

/***
 * 用户注册
 * @author wangjj
 * 2014-02-19
 *
 */
public class RegisterAction implements Action {
	
	private UserService userService;
	
	private String username;
	private String password;
	private String email;
	


	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String execute() throws Exception {
		userService.register(username, password, email);
		return "success";
	}

}
