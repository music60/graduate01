package cn.edu.gdupt.service;

import java.util.List;

import cn.edu.gdupt.model.TUser;

/***
 * 用户服务
 * @author wangjj
 *2014-2-20
 */
public interface UserService {
	
	/****
	 * 按用户名查找用户，不填时为精确查找
	 * @param username 用户名
	 * @param isAccurate 是否精确查找
	 * @return 
	 */
	List<TUser> findByUsername(String username,boolean isAccurate);
	
	/***
	 *按邮箱查找用户，不填时为精确查找
	 * @param email 邮箱
	 * @param isAccurate 是否精确查找
	 * @return
	 */
	List<TUser> findByEmail(String email,boolean isAccurate);
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	TUser login(String username,String password);
	
	/**
	 * 用户注册
	 * @param username
	 * @param password
	 * @param email
	 */
	TUser register(String username,String password,String email);
}
