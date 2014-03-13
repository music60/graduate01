package cn.edu.gdupt.service.impl;

import java.util.List;

import cn.edu.gdupt.dao.TArticleDAO;
import cn.edu.gdupt.model.TArticle;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
private TArticleDAO tArticleDAO;
	
	public TArticleDAO gettArticleDAO() {
		return tArticleDAO;
	}

	public void settArticleDAO(TArticleDAO tArticleDAO) {
		this.tArticleDAO = tArticleDAO;
	}

	@Override
	public TArticle addArticle(TArticle tArticle) {
		tArticleDAO.save(tArticle);
		return tArticle;
	}

	@Override
	public List<TArticle> findByUsername(TUser tUser, boolean b) {
		return tArticleDAO.findByUser(tUser,b);
	}

	@Override
	public List<TArticle> findByTitle(String title, boolean b) {
		return tArticleDAO.findByTitle(title,b);
	}
	
	
	
	

}
