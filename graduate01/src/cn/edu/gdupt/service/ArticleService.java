package cn.edu.gdupt.service;

import java.util.List;

import cn.edu.gdupt.model.TArticle;
import cn.edu.gdupt.model.TUser;


/**
 * 
 * 文章服务
 * 2014-3-1
 * @author wangjj
 *
 */
public interface ArticleService {

	TArticle addArticle(TArticle tArticle);

	List<TArticle> findByUsername(TUser tUser, boolean b);

	List<TArticle> findByTitle(String title, boolean b);
	
	
}
