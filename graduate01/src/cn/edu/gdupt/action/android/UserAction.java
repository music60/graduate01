package cn.edu.gdupt.action.android;

import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.UserService;

import com.google.gson.Gson;
import com.opensymphony.xwork2.Action;

/**
 * 2014-03-05
 * @author wangjj
 *
 */
public class UserAction implements Action {

	private String username;
	private String password;
	private UserService userService;
	private String result;
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String login(){
		TUser user =userService.login(username, password);
		Gson gson = new Gson();
		result= gson.toJson(user);
		System.out.println(result);
		return SUCCESS;
	}

}
