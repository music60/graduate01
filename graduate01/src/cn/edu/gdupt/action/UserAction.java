package cn.edu.gdupt.action;

import java.util.List;

import net.sf.json.JSONArray;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.UserService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;


/***
 * 用户action
 * @author studyjun
 * @date 2014-3-12
 * 用户登录，用户查找，用户添加
 *
 */
public class UserAction implements Action {

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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * 用户登录
	 * @return
	 * @throws Exception
	 */
	public String login() throws Exception {
		tUser = userService.login(username, password);
		ActionContext.getContext().getSession().put("tUser", tUser);
		if (tUser != null) {
			return "SUCCESS";
		}
		return "ERROR";
	}

	private List<TUser> tUsers;
	private JSONArray result;
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * 用户查找
	 * @return
	 * @throws Exception
	 */
	public String search() throws Exception {
		if (username != null) {
			tUsers = userService.findByUsername(username, false);
		}
		if (email != null) {
			tUsers = userService.findByEmail(email, false);
		}
		System.out.println("username" + username);
		System.out.println("email" + email);
		if (tUsers != null) {
			result = JSONArray.fromObject(tUsers); // 或者JSONArray
													// jsarry=JSONArray.fromObject(list)
		}
		return "success";

	}

	public JSONArray getResult() {
		return result;
	}

	public void setResult(JSONArray result) {
		this.result = result;
	}

	public List<TUser> gettUsers() {
		return tUsers;
	}

	public void settUsers(List<TUser> tUsers) {
		this.tUsers = tUsers;
	}
	
	
	/***
	 * 用户添加
	 * @return
	 * @throws Exception
	 */
	public String add() throws Exception {
		userService.register(username, password, email);
		return "success";
	}

}
