package cn.edu.gdupt.action;

import java.util.List;



import net.sf.json.JSONArray;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.UserService;

import com.opensymphony.xwork2.Action;

/***
 * 用户查找
 * 2014-02-20
 * @author wangjj
 *
 */
public class SearchUserAction implements Action {
	
	private String username;
	private String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private List<TUser> tUsers;
	private UserService userService;
	private JSONArray result;
	
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

	@Override
	public String execute() throws Exception {
		if (username!=null) {
			tUsers =userService.findByUsername(username,false);
		}
		if (email!=null) {
			tUsers =userService.findByEmail(email,false);
		}
		System.out.println("username"+username);
		System.out.println("email"+email);
		if (tUsers!=null) {
			result=JSONArray.fromObject(tUsers);  //或者JSONArray jsarry=JSONArray.fromObject(list)
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
	
	
}
