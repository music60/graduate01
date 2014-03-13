package cn.edu.gdupt.action;

import java.util.List;

import cn.edu.gdupt.model.TArticle;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.ArticleService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class GetArticlesByUseridAction implements Action {
	
	private int userid;
	private ArticleService articleService;
	private List<TArticle> articles;
	
	public List<TArticle> getArticles() {
		return articles;
	}

	
//	@TypeConversion(rule = ConversionRule.COLLECTION,converter="cn.edu.gdupt.model.TArticle")
	public void setArticles(List<TArticle> articles) {
		this.articles = articles;
	}


	public ArticleService getArticleService() {
		return articleService;
	}


	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}


	public int getUserid() {
		return userid;
	}


	public void setUserid(int userid) {
		this.userid = userid;
	}


	@Override
	public String execute() throws Exception {
		TUser tUser = new TUser();
		tUser.setId(userid);
		setArticles(articleService.findByUsername(tUser, true));
		ActionContext.getContext().getSession().put("articles",articles);
		return "success";
	}

}
