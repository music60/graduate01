package cn.edu.gdupt.action;

import java.sql.Timestamp;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

import cn.edu.gdupt.model.TArticle;
import cn.edu.gdupt.model.TUser;
import cn.edu.gdupt.service.ArticleService;

import com.opensymphony.xwork2.Action;

public class AddArticleAction implements Action {
	
	private ArticleService articleService;
	private String title;
	private String tag;
	private int userid;
	private String content;
	private String type;
	private Timestamp date;
	
	public ArticleService getArticleService() {
		return articleService;
	}

	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public String execute() throws Exception {
	
		TArticle tArticle = new TArticle();
		TUser tUser = new TUser();
		tUser.setId(userid);
		tArticle.setTUser(tUser);
		tArticle.setTag(tag);
		tArticle.setContent(content);
		tArticle.setDate(new Timestamp(new Date().getTime()));
		tArticle.setTitle(title);
		tArticle.setType(type);
		articleService.addArticle(tArticle);
		
		return "success";
	}

}
